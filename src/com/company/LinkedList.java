package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class LinkedList {
    public Node head;
    public int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    public boolean IsEmpty() {
        return count == 0;
    }

    public int getSize() {
        return count;
    }

    public void insertAtEnd (int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }
        else {
            Node tempHead = head;
            while (tempHead.next != null) {
                tempHead = tempHead.next;
            }
            tempHead.next = node;
        }
        count++;
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        count++;
    }

    public void insertAtNthPosition(int index, int data) {
        if (head == null) {
            insertAtStart(data);
        }
        else if (index >= count) {
            insertAtEnd(data);
        }
        else {
            Node node = new Node(data);
            Node current = head;
            Node previous = null;
            int i = 0;
            while (i < index) {
                previous = current;
                current = current.next;
                if (current == null) {
                    break;
                }
                i++;
            }
            node.next = current;
            previous.next = node;
            count++;
        }
    }

    public void DeleteAt(int index) {
        if (index == 0) {
            head = head.next;
        }
        else if(index >= count){
            System.out.println("Index out of bound");
            return;
        }
        else {
            Node temp = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            n1 = temp.next;
            temp.next = n1.next;
            n1 = null;
        }
        count--;
    }

    public int get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void printList() {
        Node currNode = head;
        System.out.print("Linkedlist : ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

}
