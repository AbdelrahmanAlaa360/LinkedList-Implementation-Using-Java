package tests;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import com.company.queueAsArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueAsArrayTest {
    @Test
    public void testIsEmpty() {
        queueAsArray queue = new queueAsArray();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyAfterAddItem() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(2);
        boolean actual = queue.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsFullAfterAddItem() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(2);
        boolean actual = queue.isFull();
        assertFalse(actual);
    }

    @Test
    public void testIsEmptyAfterDel() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(2);
        queue.Dequeue();
        boolean actual = queue.isEmpty();
        assertTrue(actual);
    }

    @Test
    public void testIsEmptyAfterDeleteThenAdd() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(2);
        queue.Dequeue();
        queue.Enqueue(2);
        boolean actual = queue.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsFullAfterAddSizeItems() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(0);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        boolean actual = queue.isFull();
        assertTrue(actual);
    }

    @Test
    public void testIsEmptyAddThenDelete() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(5);
        queue.Dequeue();
        boolean actual = queue.isEmpty();
        assertTrue(true);
    }

    @Test
    public void testIsFullEmptyAddThenDelete() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(5);
        queue.Dequeue();
        queue.Enqueue(10);
        boolean actual = queue.isFull();
        assertFalse(actual);
    }

    //@Test
    public void testIsGreaterThanSize() {
        queueAsArray queue = new queueAsArray();
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
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(0);
    }

    @Test
    public void testDequeue() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(0);
        assertTrue(0 == queue.Dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testOrderingDequeue() {
        queueAsArray queue = new queueAsArray();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        assertEquals(1, queue.Dequeue());
        assertEquals(2, queue.Dequeue());
        assertEquals(3, queue.Dequeue());
    }

    @Test
    public void testDequeWhenEmpty() {
        queueAsArray queue = new queueAsArray();
        queue.Dequeue();
        assertTrue(queue.isEmpty());
    }

}
