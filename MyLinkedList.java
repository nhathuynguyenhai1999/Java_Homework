package James_Module2;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        numNodes++;
    }

    private static class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return this.data;
        }
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int index, Object data) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    private void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(2, 9);
        ll.add(4, 9);
        ll.printList();
    }
}

