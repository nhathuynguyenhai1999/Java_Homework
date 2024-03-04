package DesignPattern.com.codegym;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MemoryPoolDesignPattern {
    public static class Bullet {
        public static int count = 0;
        private int position;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public Bullet() {
            count++;
        }

        public void move() {
            position++;
        }
    }
    public abstract static class MemoryPool<Y> {
        private final LinkedList<Y> free_items = new LinkedList<>();
        public void freeItem(Y item) {
            free_items.add(item);
        }
        protected abstract Y allocate();
        public Y newItem() {
            Y out = null;
            if (free_items.isEmpty()) {
                out = allocate();
            } else {
                out = free_items.getFirst();
                free_items.removeFirst();
            }
            return out;
        }
    }

    public static class BulletMemoryPool extends MemoryPool<Bullet> {
        @Override
        protected Bullet allocate() {
            return new Bullet();
        }
    }
    public static class Gun {
        private final int bulletCount = 1000;

        public void fireInPool() {
            BulletMemoryPool pool = new BulletMemoryPool();
            List<Bullet> plist = new ArrayList<>();
            for (int i = 0; i < bulletCount; i++) {
                Bullet p = pool.newItem();
                p.setPosition(0);
                plist.add(p);
                for (int j = 0; j < plist.size(); j++) {
                    Bullet pp = plist.get(j);
                    pp.move();
                    System.out.print("-" + pp.getPosition());
                    if (pp.getPosition() == 10) {
                        pool.freeItem(pp);
                        plist.remove(pp);
                    }
                }
                System.out.println();
            }
        }

        public void fire() {
            List<Bullet> plist = new ArrayList<>();
            for (int i = 0; i < bulletCount; i++) {
                Bullet p = new Bullet();
                p.setPosition(0);
                plist.add(p);
                for (int j = 0; j < plist.size(); j++) {
                    Bullet pp = plist.get(j);
                    pp.move();
                    System.out.print("-" + pp.getPosition());
                    if (pp.getPosition() == 10) {
                        plist.remove(pp);
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");
        gun.fire();
        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count);
    }
}
