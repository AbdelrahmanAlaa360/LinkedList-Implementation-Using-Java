package com.company;

public class QueueAsLinkedList {
    LinkedList queueList;

    public QueueAsLinkedList() {
        queueList = new LinkedList();
    }

    /**
     * this method is used to add element in the queue
     * Add newItem to the back of the queue
     *
     * @param data
     */
    public void Enqueue(int data) {
        queueList.insertAtStart(data);
    }

    /**
     * This method removes an element from the front of the queue
     */
    public int Deque() {
        if(queueList.getSize() == 0){
            System.out.println("Queue is Empty");
            return 0;
        }
        int data = queueList.getElement(queueList.getSize() - 1);
        queueList.DeleteAt(queueList.getSize() - 1);
        return data;
    }

    /**
     * This method is used to check if element is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return queueList.IsEmpty();
    }

    /**
     * This method is use to get the size of linked list
     *
     * @return integer
     */
    public int getSize() {
        return queueList.getSize();
    }

    /**
     * This method return an element from the front of the queue
     * @return integer
     */
    public int peek() {
        return queueList.getElement(queueList.getSize() - 1);
    }
}
