package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    private DrinkQueue queue;
    private SimpleDrink simpleDrink1;
    private Cocktail cocktail;
    private List<Liquid> liquids;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue();
        liquids = new ArrayList<>();

        liquids.add(new Liquid("Water", 0.5, 0));
        liquids.add(new Liquid("Whiskey", 0.05, 40));

        simpleDrink1 = new SimpleDrink("WaterDrink", liquids.get(0));
        cocktail = new Cocktail("WaterWhiskeyCocktail", liquids);
    }

    @DisplayName("Test if offer adds a SimpleDrink to the queue")
    @Test
    public void testOfferAddsSimpleDrink() {
        assertTrue(queue.offer(simpleDrink1));
        assertEquals(simpleDrink1, queue.peek());
    }

    @DisplayName("Test if offer adds a Cocktail to the queue")
    @Test
    public void testOfferAddsCocktail() {
        assertTrue(queue.offer(cocktail));
        assertEquals(cocktail, queue.peek());
    }

    @DisplayName("Test if offer returns false if drink is null")
    @Test
    public void testOfferNullReturnsFalse() {
        assertFalse(queue.offer(null));
    }

    @DisplayName("Test if poll returns and removes first element")
    @Test
    public void testPollReturnsAndRemovesFirstElement() {
        queue.offer(simpleDrink1);
        queue.offer(cocktail);

        assertEquals(simpleDrink1, queue.poll());
        assertEquals(cocktail, queue.poll());
        assertNull(queue.poll());
    }

    @DisplayName("Test if remove returns and removes first element")
    @Test
    public void testRemoveReturnsAndRemovesFirstElement() {
        queue.offer(simpleDrink1);
        queue.offer(cocktail);

        assertEquals(simpleDrink1, queue.remove());
        assertEquals(cocktail, queue.remove());
    }

    @DisplayName("Test if remove throws NoSuchElementException if empty")
    @Test
    public void testRemoveThrowsNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @DisplayName("Test if peek returns first element without removing")
    @Test
    public void testPeekReturnsFirstElementWithoutRemoving() {
        queue.offer(simpleDrink1);
        assertEquals(simpleDrink1, queue.peek());
        assertEquals(simpleDrink1, queue.peek());
    }

    @DisplayName("Test if peek returns null if empty")
    @Test
    public void testPeekReturnsNullIfEmpty() {
        assertNull(queue.peek());
    }

    @DisplayName("Test if element returns first element without removing")
    @Test
    public void testElementReturnsFirstElementWithoutRemoving() {
        queue.offer(simpleDrink1);
        assertEquals(simpleDrink1, queue.element());
        assertEquals(simpleDrink1, queue.element());
    }

    @DisplayName("Test if element throws NoSuchElementException if empty")
    @Test
    public void testElementThrowsNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}
