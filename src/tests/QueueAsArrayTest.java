package tests;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import com.company.QueueAsArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueAsArrayTest {
    @Test
    public void testIsEmpty() {
        QueueAsArray queue = new QueueAsArray();
        assertTrue(queue.IsEmpty());
    }

    @Test
    public void testIsEmptyAfterAddItem() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(2);
        boolean actual = queue.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsFullAfterAddItem() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(2);
        boolean actual = queue.Isfull();
        assertFalse(actual);
    }

    @Test
    public void testIsEmptyAfterDel() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(2);
        queue.Dequeue();
        boolean actual = queue.IsEmpty();
        assertTrue(actual);
    }

    @Test
    public void testIsEmptyAfterDeleteThenAdd() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(2);
        queue.Dequeue();
        queue.Enqueue(2);
        boolean actual = queue.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsFullAfterAddSizeItems() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(0);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        boolean actual = queue.Isfull();
        assertTrue(actual);
    }

    @Test
    public void testIsEmptyAddThenDelete() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(5);
        queue.Dequeue();
        boolean actual = queue.IsEmpty();
        assertTrue(true);
    }

    @Test
    public void testIsFullEmptyAddThenDelete() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(5);
        queue.Dequeue();
        queue.Enqueue(10);
        boolean actual = queue.Isfull();
        assertFalse(actual);
    }

    //@Test
    public void testIsGreaterThanSize() {
        QueueAsArray queue = new QueueAsArray();
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
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(0);
    }

    @Test
    public void testDequeue() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(0);
        assertTrue(0 == queue.Dequeue());
        assertTrue(queue.IsEmpty());
    }

    @Test
    public void testOrderingDequeue() {
        QueueAsArray queue = new QueueAsArray();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        assertEquals(1, queue.Dequeue());
        assertEquals(2, queue.Dequeue());
        assertEquals(3, queue.Dequeue());
    }

    @Test
    public void testDequeWhenEmpty() {
        QueueAsArray queue = new QueueAsArray();
        queue.Dequeue();
        assertTrue(queue.IsEmpty());
    }

}
