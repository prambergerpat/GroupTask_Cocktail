package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * DrinkQueue is a simple Queue implementation for objects using the Drink interface
 */
public class DrinkQueue{

    // List of Drinks
    List<Drink> elements = new ArrayList<>();

    /**
     * Adds a new drink to the queue
     *
     * @param drink new drink to add
     * @return true if drink was added, otherwise false
     */
    public boolean offer(Drink drink) {
        if (drink == null) {
            return false;
        }
        elements.add(drink);
        return true;
    }

    /**
     * Removes and returns the first drink from the queue
     *
     * @return the first drink in the queue, otherwise null if queue is empty
     */
    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.removeFirst();
    }

    /**
     * Removes and returns the first drink from the queue
     *
     * @return the first drink in the queue
     * @throws NoSuchElementException if queue is empty
     */
    public Drink remove() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return elements.removeFirst();
    }

    /**
     * Returns the first drink from the queue without removing it
     *
     * @return the first drink in the queue, otherwise null if queue is empty
     */
    public Drink peek() {
        return elements.isEmpty() ? null : elements.getFirst();
    }

    /**
     * Returns the first drink from the queue without removing it
     *
     * @return the first drink in the queue
     * @throws NoSuchElementException if queue is empty
     */
    public Drink element() {
        return elements.getFirst();
    }
}