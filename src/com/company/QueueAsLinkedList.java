package com.company;

public class QueueAsLinkedList {
    LinkedList queueList;

    public QueueAsLinkedList() {
        queueList = new LinkedList();
    }

    public void Enqueue(int data) {
        queueList.insertAtStart(data);
    }

    public int Deque() {
        if(queueList.getSize() == 0){
            System.out.println("Queue is Empty");
            return 0;
        }
        int data = queueList.get(queueList.getSize() - 1);
        queueList.DeleteAt(queueList.getSize() - 1);
        return data;
    }

    public boolean isEmpty() {
        return queueList.IsEmpty();
    }

    public int getSize() {
        return queueList.getSize();
    }

    public void peek() {
        queueList.get(0);
    }
}
