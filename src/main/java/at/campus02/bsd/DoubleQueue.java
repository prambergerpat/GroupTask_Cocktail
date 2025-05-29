package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * DoubleQueue is a simple Queue implementation for double objects using the IQueue interface
 */
public class DoubleQueue {

    List<Double> numbers = new ArrayList<>();

    /**
     * Adds a new double to the queue.
     * @param num the object, which should be added to the queue
     * @return true if double was added, otherwise false
     */
    public boolean offer(Double num) {
        if (num == null) {
            return false;
        }
        return numbers.add(num);
    }

    /**
     * Removes and returns the first drink from the queue.
     * @return the first drink in the queue, otherwise null if the queue is empty
     */
    public Double poll() {
        if (numbers.isEmpty()) {
            return null;
        }
        return numbers.removeFirst();
    }

    /**
     * Removes and returns the first double from the queue.
     * @return the first drink in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Double remove() {
        if (numbers.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return numbers.removeFirst();
    }

    /**
     * Returns the first double from the queue without removing it.
     * @return the first double in the queue, otherwise null if queue is empty
     */
    public Double peek() {
        return numbers.isEmpty() ? null : numbers.getFirst();
    }

    /**
     * Returns the first double from the queue without removing it.
     * @return the first double in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Double element() {
        return numbers.getFirst();
    }
}
