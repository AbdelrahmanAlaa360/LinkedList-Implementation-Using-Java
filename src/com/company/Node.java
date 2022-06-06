package com.company;

public class Node {
    public int data;
    public Node next;

    public Node() {
        next = null;
        data = 0;
    }

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
