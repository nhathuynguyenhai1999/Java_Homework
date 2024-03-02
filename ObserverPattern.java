package BehavionalDesignPattern;
import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObserverPattern {
    abstract static class Observer {
        protected Subject subject;
        public abstract void update();
    }
    public static class Subject {
        private final List<Observer> observers = new ArrayList<>();
        private int state;
        public void add(Observer o) {
            observers.add(o);
        }
        public int getState() {
            return state;
        }
        public void setState(int value) {
            this.state = value;
            execute();
        }
        private void execute() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }
    public static class HexObserver extends Observer {
        public HexObserver(Subject subject) {
            this.subject = subject;
            this.subject.add(this);
        }
        public void update() {
            System.out.print(" " + Integer.toHexString(subject.getState()));
        }
    }
    public static class OctObserver extends Observer {
        public OctObserver(Subject subject) {
            this.subject = subject;
            this.subject.add( this );
        }
        public void update() {
            System.out.print(" " + Integer.toOctalString(subject.getState()));
        }
    }
    public static class BinObserver extends Observer {
        public BinObserver(Subject subject) {
            this.subject = subject;
            this.subject.add(this);
        }
        public void update() {
            System.out.print(" " + Integer.toBinaryString(subject.getState()));
        }
    }
    public static class ObserverDemo {
        public static void main(String[] args) {
            Subject sub = new Subject();
            // Client configures the number and type of Observers
            new HexObserver(sub);
            new OctObserver(sub);
            new BinObserver(sub);
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.print("\nEnter a number: ");
                sub.setState(Integer.parseInt(scanner.nextLine()));
            }
        }
    }
}
