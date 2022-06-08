package com.company;

public class queueAsArray {
    Object[] ArrayQueue;
    int rear;   // last added item
    int front;  // first added item
    final int size = 5;
    int items[] = new int[size];

    public queueAsArray() {
        front = -1;
        rear = -1;
    }

    /**
     * This method is used to check if element is full or not
     *
     * @return boolean
     */
    public boolean isFull() {
        return (rear == size - 1 && front == 0);
    }

    /**
     * This method is used to check if element is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return (front == -1);
    }

    /**
     * this method is used to add element in the queue
     * Add newItem to the back of the queue
     *
     * @param newItem
     */
    public void Enqueue(int newItem) {
        if (isFull()) {
            //throw new ArrayStoreException("Array is Full");
            System.out.println("Array is Full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = newItem;
        }
    }

    /**
     * This method removes an element from the front of the queue
     */
    public int Dequeue() {
        int item;
        if (isEmpty()) {
            System.out.println("Queue is Empty .");
            return -1;
        } else {
            item = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Item Deleted -> " + item);
            return item;
        }
    }
}
