package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new StringQueue(3);
    }

    @DisplayName("Test if offer adds elements correctly to the queue")
    @Test
    public void testOfferWithinCapacity() {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
    }

    @DisplayName("Test if offer returns false if queue is full")
    @Test
    public void testOfferBeyondCapacity() {
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        assertFalse(queue.offer("D"));
    }

    @DisplayName("Test if poll returns and removes first element and returns null if queue is empty")
    @Test
    public void testPollReturnsAndRemovesElements() {
        queue.offer("A");
        queue.offer("B");

        assertEquals("A", queue.poll());
        assertEquals("B", queue.poll());
        assertNull(queue.poll());
    }

    @DisplayName("Test if remove returns and removes first element")
    @Test
    public void testRemoveReturnsAndRemovesElement() {
        queue.offer("A");
        queue.offer("B");
        assertEquals("A", queue.remove());
        assertEquals("B", queue.remove());
    }

    @DisplayName("Test if remove throws NoSuchElementException if queue is empty")
    @Test
    public void testRemoveThrowsExceptionWhenEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @DisplayName("Test if peek returns first element without removing")
    @Test
    public void testPeekReturnsElementWithoutRemoving() {
        queue.offer("A");
        assertEquals("A", queue.peek());
        assertEquals("A", queue.peek());
    }

    @DisplayName("Test if peek returns null if queue is empty")
    @Test
    public void testPeekReturnsNullWhenEmpty() {
        assertNull(queue.peek());
    }

    @DisplayName("Test if element returns first element without removing")
    @Test
    public void testElementReturnsElementWithoutRemoving() {
        queue.offer("A");
        assertEquals("A", queue.element());
        assertEquals("A", queue.element());
    }

    @DisplayName("Test if element throws NoSuchElementException if queue is empty")
    @Test
    public void testElementThrowsExceptionWhenEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }

}
