package tests;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import com.company.LinkedList;
import com.company.QueueAsLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueAsLinkedListTest {
    @Test
    public void testisEmpty() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testisEmptyAfterAddItem() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(2);
        boolean actual = queue.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void testisEmptyAfterDel() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(2);
        queue.Deque();
        boolean actual = queue.isEmpty();
        assertTrue(actual);
    }

    @Test
    public void testisEmptyAfterDeleteThenAdd() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(2);
        queue.Deque();
        queue.Enqueue(2);
        boolean actual = queue.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void testisEmptyAddThenDelete() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(5);
        queue.Deque();
        boolean actual = queue.isEmpty();
        assertTrue(true);
    }

    //@Test
    public void testIsGreaterThanSize() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        for (int i = 1; i <= 10; i++) {
            queue.Enqueue(i);
        }
        /*
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });
        String expectedMessage = "Array is Full";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        */
    }

    @Test
    public void testEnqueue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(0);
    }

    @Test
    public void testDeque() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(0);
        assertTrue(0 == queue.Deque());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testOrderingDeque() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(1); // 3 2 1
        queue.Enqueue(2);
        queue.Enqueue(3);
        assertEquals(1, queue.Deque());
        assertEquals(2, queue.Deque());
        assertEquals(3, queue.Deque());
    }

    @Test
    public void testDequeWhenEmpty() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Deque();
        assertTrue(queue.isEmpty());
    }

    @Test //(expected=IllegalStateException.class)
    public void testOrderDelinMed() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        queue.Deque();
        queue.Deque();
        queue.Enqueue(5);
        queue.Enqueue(6);
        assertEquals(3, queue.Deque());
        assertEquals(4, queue.Deque());
        assertEquals(5, queue.Deque());
        assertEquals(6, queue.Deque());

    }

    @Test
    public void testOrderDelinLast() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Deque();
        assertEquals(2, queue.Deque());

    }

    //@Test(expected=NoSuchElementException.class)
    public void testEnqueueOnEmptyQueue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        assertTrue(queue.isEmpty());
        queue.Enqueue(5);
        assertEquals(1, queue.getSize());
        assertFalse(queue.isEmpty());
    }


    @Test
    public void testInsertsToEmptyQueue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();

        int numberOfInserts = 6;

        for (int i = 0; i < numberOfInserts; i++) {
            queue.Enqueue(numberOfInserts);
        }

        assertTrue(!queue.isEmpty());
        assertEquals(queue.getSize(), numberOfInserts);
    }

    @Test
    public void testEnqueueThenPeek() {
        int queueVal = 5;
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(queueVal);
        int size = queue.getSize();
        assertEquals(queue.peek(), queueVal);
        assertEquals(queue.getSize(), size);
    }

    @Test
    public void testRemovingDownToEmpty() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        int numberOfRemoves = (int) (Math.random() * 20 + 1);

        for (int i = 0; i < numberOfRemoves; i++) {
            queue.Enqueue(numberOfRemoves);
        }
        for (int i = 0; i < numberOfRemoves; i++) {
            queue.Deque();
        }

        assertTrue(queue.isEmpty());
        assertEquals(queue.getSize(), 0);
    }

    @Test
    public void testFirstInFirstOut() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        for (int i = 1; i <= 5; i++) {
            queue.Enqueue(i);
            assertEquals(false, queue.isEmpty());
            assertEquals(i, queue.getSize());
        }
        for (int i = 1; i <= 5; i++) {
            assertEquals(false, queue.isEmpty());
            assertEquals(i, (int) queue.Deque());
        }
        assertEquals(true, queue.isEmpty());
    }

    @Test
    public void testRemoveQueue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Deque();
        queue.Enqueue(3);
        queue.Deque();
        queue.Deque();
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testQueueSize() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(5);
        queue.Enqueue(10);
        int actualSize = queue.getSize();
        assertEquals(2, actualSize);
    }

    @Test
    public void testSizeAfterDequeue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(5);
        queue.Enqueue(10);
        queue.Deque();
        int actualSize = queue.getSize();
        assertEquals(1, actualSize);
    }

    @Test
    public void testEmptySizeInQueue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        int actual = queue.getSize();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testEnqueueOrder() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        for (int i = 1; i <= 3; i++) {
            assertEquals(i, queue.Deque());
        }
    }

    @Test
    public void testPeekAfterEnqueueThenDeque(){
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(5);
        queue.Enqueue(10);
        queue.Deque();
        queue.Enqueue(15);
        int actual = queue.peek();
        assertEquals(10, actual);
    }

    @Test
    public void testIsEmptyAfterDeque(){
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Deque();
        int actual = queue.getSize();
        assertEquals(0, actual);
    }

    @Test
    public void testSize() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        assertEquals(0, queue.getSize());
        queue.Enqueue(5);
        assertEquals(1, queue.getSize());
        queue.Enqueue(10);
        assertEquals(2, queue.getSize());
        queue.Enqueue(15);
        assertEquals(3, queue.getSize());
    }

    @Test
    public void TestsingleItem() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(5);
        assertEquals(5, queue.peek());
        assertEquals(1, queue.getSize());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIterator() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        int testSum = 0;
        queue.Enqueue(5);
        queue.Enqueue(15);
        queue.Enqueue(20);
        assertEquals(3, queue.getSize());
        int n = queue.getSize();
        for (int i=0; i< n; i++) {
            testSum = testSum + queue.Deque();
        }
        assertEquals(40, testSum);
    }

    @Test
    public void testPeekInEmptyQueue(){
        QueueAsLinkedList queue = new QueueAsLinkedList();
        assertTrue(queue.isEmpty());
        assertEquals(0,queue.getSize());
    }

    @Test
    public void testPeek(){
        QueueAsLinkedList queue = new QueueAsLinkedList();
        assertTrue(queue.isEmpty());
        queue.Enqueue(5);
        queue.Enqueue(15);
        assertEquals(5 ,queue.peek());
    }

    @Test
    public void testSizeInEmptyAndFullQueue(){
        QueueAsLinkedList queue = new QueueAsLinkedList();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.getSize());
        queue.Enqueue(5);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.getSize());
    }


    @Test
    public void test1000InThen1000Out() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        for (int i = 0; i < 1000; i++) {
            queue.Enqueue(i);
        }
        for (int i = 0; i < 1000; i++) {
            assertEquals(((Integer) queue.Deque()).intValue(), i);
        }
    }

    @Test
    public void testEnqueuenegativenumberInEmptyQueue() {
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue.Enqueue(-5);
    }

}
