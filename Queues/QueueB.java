package Queues;

import java.util.*;

public class QueueB {
    // static class Queue {
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;

    // Queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // front = -1;
    // }

    // public static boolean isEmpty() {
    // return rear == -1 && front == -1;
    // }

    // public static boolean isFull() {
    // return (rear + 1) % size == front;
    // }

    // // Add Operation O(1)
    // public static void add(int data) {
    // if (isFull()) {
    // System.out.println("queue is full");
    // return;
    // }
    // // add 1st element
    // if (front == -1) {
    // front = 0;
    // }
    // rear = (rear + 1) % size;
    // arr[rear] = data;
    // }

    // // Remove Operation O(1)
    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }

    // int result = arr[front];
    // // last element delete
    // if (rear == front) {
    // rear = front = -1;
    // } else {
    // front = (front + 1) % size;
    // }
    // return result;
    // }

    // // Peek Operation O(1)
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }

    // return arr[front];
    // }

    // Queue using LL -> O(n)
    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }

    // }

    // static class Queue {
    // static Node head = null;
    // static Node tail = null;

    // public static boolean isEmpty() {
    // return head == null && tail == null;
    // }

    // // add
    // public static void add(int data) {
    // Node newnNode = new Node(data);
    // if (head == null) {
    // head = tail = newnNode;
    // return;
    // }
    // tail.next = newnNode;
    // tail = newnNode;
    // }

    // // remove
    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }

    // int front = head.data;
    // // single element
    // if (tail == head) {
    // tail = head = null;
    // } else {
    // head = head.next;
    // }
    // return front;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }
    // return head.data;
    // }
    // }

    public static void main(String[] args) {
        // Queue q = new Queue();
        // Queue is an interface and hence it cannot have its
        // own object but it can be
        // implemented with the help of either linkedlist or ArrayDeque class.

        // Queue<Integer> q = new LinkedList<>(); // Using Linkedlist
        Queue<Integer> q = new ArrayDeque<>(); // Using ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }
}
