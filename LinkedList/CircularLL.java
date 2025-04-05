package LinkedList;

public class CircularLL {
    static class Node {
        int data;
        Node next;
    };

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null) {
            return null;
        }

        Node newNode, p;
        p = last.next;
        do {
            if (p.data == item) {
                newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;
                if (p == last)
                    last = newNode;
                return last;
            }
            p = p.next;
        }
        while (p != last.next);
        System.out.println(item + "The given node is not present in the list");
        return last;

    }

    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;
             // If the list contains only one node
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last, d = new Node();

           // If the node to be deleted is the last node
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
            return last;
        }

         // Traversing the list to find the node to delete
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

          // If the node to be deleted is found
        if (temp.next.data == key) {
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    static void traverse(Node last) {
        Node p;
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        p = last.next; // Start from the node next to last
        do {
            System.out.print(p.data + " ");
            p = p.next;
        }

        while (p != last.next);  // Loop until we reach the start point again
    }

    public static void main(String[] args) {
        Node last = null;
     
        // Adding elements to the list
        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);

        // Traversing the list
        System.out.println("List after additions:");
        traverse(last);

        // Deleting a node
        last = deleteNode(last, 8);

        // Traversing after deletion
        System.out.println("List after deletion:");
        traverse(last);
    }
}
