package tests;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

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

}
