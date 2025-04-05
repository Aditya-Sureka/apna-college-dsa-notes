package LinkedList;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove - removeFirst
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // removeLAST
    public int removeLast() {
        if (size == 0) {
            System.out.println("Doubly Linked List is empty");
            return -1; // Indicates empty list
        } else if (size == 1) {
            int val = head.data;
            head = tail = null; // Set both head and tail to null when list becomes empty
            size = 0;
            return val;
        }

        // Update tail and its previous node
        int val = tail.data;
        tail = tail.prev; // Move the tail to the previous node
        tail.next = null; // Disconnect the old tail node

        size--;
        return val;
    }

    // reverse a doubly LL ->
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);

        // dll.addLast(4);
        // dll.print();
        // System.out.println(dll.size);

        // dll.removeLast();
        // dll.print();

        // System.out.println(dll.size);
        dll.reverse();
        dll.print();

    }

}
