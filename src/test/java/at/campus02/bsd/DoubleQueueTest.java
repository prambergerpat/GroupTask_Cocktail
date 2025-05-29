package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleQueueTest {

    static DoubleQueue doubleQueue;
    static Double num;
    static Double num2;

    @BeforeEach
    void setUp() {
        doubleQueue = new DoubleQueue();
        num = 0.23;
        num2 = 1.23;
    }

    @DisplayName("Test testOfferAddsDouble() method")
    @Test
    void testOfferAddsDouble() {
        assertTrue(doubleQueue.offer(num));
        assertEquals(num, doubleQueue.peek());
    }

    @DisplayName("Test testOfferNullReturnsFalse() method")
    @Test
    void testOfferNullReturnsFalse() {
        assertFalse(doubleQueue.offer(null));
    }

    @DisplayName("Test testPollReturnsAndRemovesFirstElement() method")
    @Test
    void testPollReturnsAndRemovesFirstElement() {
        doubleQueue.offer(num);
        doubleQueue.offer(num2);

        assertEquals(num, doubleQueue.poll());
        assertEquals(num2, doubleQueue.poll());
        assertNull(doubleQueue.poll());
    }

    @DisplayName("Test testRemoveReturnsAndRemovesFirstElement() method")
    @Test
    public void testRemoveReturnsAndRemovesFirstElement() {
        doubleQueue.offer(num);
        doubleQueue.offer(num2);

        assertEquals(num, doubleQueue.remove());
        assertEquals(num2, doubleQueue.remove());
    }

    @DisplayName("Test testRemoveThrowsNoSuchElementException() method")
    @Test
    public void testRemoveThrowsNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> doubleQueue.remove());
    }

    @DisplayName("Test testPeekReturnsFirstElementWithoutRemoving() method")
    @Test
    public void testPeekReturnsFirstElementWithoutRemoving() {
        doubleQueue.offer(num);
        assertEquals(num, doubleQueue.peek());
        assertEquals(num, doubleQueue.peek());
    }

    @DisplayName("Test testPeekReturnsNullIfEmpty() method")
    @Test
    public void testPeekReturnsNullIfEmpty() {
        assertNull(doubleQueue.peek());
    }

    @DisplayName("Test testElementReturnsFirstElementWithoutRemoving() method")
    @Test
    public void testElementReturnsFirstElementWithoutRemoving() {
        doubleQueue.offer(num);
        assertEquals(num, doubleQueue.element());
        assertEquals(num, doubleQueue.element());
    }

    @DisplayName("Test testElementThrowsNoSuchElementException() method")
    @Test
    public void testElementThrowsNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> doubleQueue.element());
    }
}
