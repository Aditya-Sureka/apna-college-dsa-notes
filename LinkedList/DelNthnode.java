package LinkedList;

public class DelNthnode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // link
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthFromEnd(int n) {
        // Special case: Removing the head
        if (n == size) {
            head = head.next;
            size--;
            return;
        }

        // Find the node just before the nth node from the end
        int iToFind = size - n;
        Node prev = head;
        for (int i = 1; i < iToFind; i++) {
            prev = prev.next;
        }

        // Skip the nth node
        prev.next = prev.next.next;
        size--;
    }

    public static void main(String args[]) {
        DelNthnode ll = new DelNthnode();  // Fix class name
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
    }
}
