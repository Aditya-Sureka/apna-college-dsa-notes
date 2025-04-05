package Stacks;

import java.util.*;

public class StackB {
    // STACK IMPLEMENTATION USING ArrayList ->
    // static class Stack {
    // static ArrayList<Integer> list = new ArrayList<>();

    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // // push
    // public static void push(int data) {
    // list.add(data);
    // }

    // // pop
    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return top;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return list.get(list.size() - 1);
    // }
    // }

    // STACK IMPLEMENTATION USING LL ->
    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // static class Stack {
    // static Node head = null;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // // push
    // public static void push(int data) { // push -> head replace
    // Node newNode = new Node(data); // new node creation

    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }

    // newNode.next = head;
    // head = newNode;
    // }

    // // pop
    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }

    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }
    // }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // FOR STACK IMPLEMENTATION USING JAVA COLLECTION FRAMEWORK, JUST 1 LINE IS
        // NEEDED ->
        Stack<Integer> s = new Stack<>(); // This is that single line using Collection Framework.

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
