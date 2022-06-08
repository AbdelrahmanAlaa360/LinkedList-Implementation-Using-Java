package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class LinkedList {
    public Node head;
    public int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    /**
     * This method is use to check if the lined list is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * This method is use to get the size of linked list
     *
     * @return integer
     */
    public int getSize() {
        return count;
    }

    /**
     * this method is used to add element in the linked list
     * Add data at the end of linked list
     *
     * @param data
     */
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

    /**
     * this method is used to add element in the linked list
     * Add data at the start of linked list
     *
     * @param data
     */
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        count++;
    }

    /**
     * this method is used to add element in the linked list
     * Add data at specific index at the linked list
     *
     * @param index
     * @param data
     */
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

    /**
     * this method is used to delete element in the linked list
     * delete element at specific index at the linked list
     *
     * @param index
     */
    public void deleteAt(int index) {
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


    /**
     * This method is use to search in the linked list
     * Return a specific data in a specific index in the linked list
     *
     * @param index
     * @return integer
     */
    public int getElement(int index) {
        if(index >= count){
            System.out.println("Index out of bound");
            return 0;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }


    /**
     * This method is used to print the linked list
     */
    public String printList() {
        Node currNode = head;
        String stringList = "";
        stringList += "LinkedList : ";
        while (currNode != null) {
            stringList += currNode.data + " ";
            currNode = currNode.next;
        }
        return stringList;
    }

}
