package James_Module2;

import java.util.Arrays;

class MyList {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(Object element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity();

        // Shift elements to make space for the new element
        System.arraycopy(elements, index, elements, index + 1, size - index);

        // Insert the new element at the specified index
        elements[index] = element;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // Shift elements to remove the element at the specified index
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();

        // Testing add method
        myList.add(1);
        myList.add(2);
        myList.add(3);

        // Testing add at specific index
        myList.add(1, 5);

        // Testing get method
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        // Testing remove method
        myList.remove(2);

        // Displaying the final list
        System.out.println("Final list after removal:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }
    }
}

