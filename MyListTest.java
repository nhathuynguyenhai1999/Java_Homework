package James_Module2;
import java.util.Arrays;

//import javax.xml.bind.annotation.XmlType;

//import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;


public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

        // Uncomment the lines below to see how exceptions are handled
        // System.out.println("element 6: " + listInteger.get(6));
        // System.out.println("element -1: " + listInteger.get(-1));
    }

    static class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        public void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        public void add(E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = e;
        }

        public E get(int i) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
            }
            return (E) elements[i];
        }
    }
}
