package tests;

import com.company.LinkedList;
import com.company.Node;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    public void testIsEmpty() {
        LinkedList list = new LinkedList();
        boolean actual = list.IsEmpty();
        assertTrue(actual);
    }

    @Test
    public void testIsEmptyAfterInsert() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(0);
        boolean actual = list.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsEmptyAfterInsertAt() {
        LinkedList list = new LinkedList();
        list.insertAtNthPosition(0, 5);
        boolean actual = list.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsEmptyAfterInsertAtStart() {
        LinkedList list = new LinkedList();
        list.insertAtStart(5);
        boolean actual = list.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testSize() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        int actualSize = list.getSize();
        assertEquals(2, actualSize);
    }

    @Test
    public void testSizeAfterDelete() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.DeleteAt(0);
        int actualSize = list.getSize();
        assertEquals(1, actualSize);
    }

    @Test
    public void testEmptySize() {
        LinkedList list = new LinkedList();
        int actual = list.getSize();
        int expectedSize = 0;
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testSizeAfterDeletion() {
        LinkedList list = new LinkedList();
        list.insertAtStart(5);
        list.insertAtStart(4);
        list.DeleteAt(1);
        int actual = list.getSize();
        int expectedSize = 1;
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testSizeAfterInsertEnd() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        int actual = list.getSize();
        int expectedSize = 2;
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testSizeAfterInsertStartAndEnd() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(4);
        list.insertAtStart(8);
        int actual = list.getSize();
        int expectedSize = 2;
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testSizeAfterInsertAtNthPosition() {
        LinkedList list = new LinkedList();
        list.insertAtNthPosition(0, 5);
        list.insertAtNthPosition(1, 15);
        list.insertAtNthPosition(1, 10);
        int actual = list.getSize();
        int expectedSize = 3;
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testSizeAfterInsertAtNthPositionOutOfBound() {
        LinkedList list = new LinkedList();
        list.insertAtNthPosition(3, 15);
        list.insertAtNthPosition(2, 10);
        list.insertAtNthPosition(1, 5);
        int actual = list.getSize();
        int expectedSize = 3;
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testSizeAfterDeleteMultiple() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.DeleteAt(0);
        list.DeleteAt(0);
        int actualSize = list.getSize();
        assertEquals(0, actualSize);
    }

    @Test
    public void testSizeAfterDeleteMultipleIndex() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.DeleteAt(2);
        list.DeleteAt(0);
        int actualSize = list.getSize();
        assertEquals(2, actualSize);
    }

    @Test
    public void testSizeAfterDeleteOutOfBoundIndex() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.DeleteAt(10);
        list.DeleteAt(8);
        int actualSize = list.getSize();
        int expected = 4;
        assertEquals(expected, actualSize);
    }

    @Test
    public void testIsEmptyAfterDeleteAll() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.DeleteAt(0);
        list.DeleteAt(0);
        boolean actual = list.IsEmpty();
        assertTrue(actual);
    }

    @Test
    public void testIsEmptyAfterDeleteOnce() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.DeleteAt(1);
        boolean actual = list.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testIsEmptyAfterDeleteOutOfBound() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.DeleteAt(10);
        list.DeleteAt(10);
        boolean actual = list.IsEmpty();
        assertFalse(actual);
    }

    @Test
    public void testSizeAfterDeleteOutOfBound() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.DeleteAt(10);
        list.DeleteAt(10);
        int actual = list.getSize();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertOrder() {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        Node curr = list.head;
        int[] expectedResult = new int[]{5, 10};
        for (int i = 0; i < list.getSize(); i++) {
            assertEquals(expectedResult[i], curr.data);
            curr = curr.next;
        }
    }



}
