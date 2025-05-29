package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class represents a queue for strings with a fixed maximum size.
 */

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  /**
   * Creates a StringQueue with the given maximum size.
   *
   * @param maxSize the maximum number of elements allowed
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * Adds a string to the end of the queue if it is not full
   *
   * @param obj the string to add
   * @return true if the string was added, false if the queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Removes and returns the head of the queue, or null if the queue is empty.
   *
   * @return the first element or null if the queue is empty.
   */
  @Override
  public String poll() {
    if (!elements.isEmpty()) {
      return elements.removeFirst();
    }

    return null;
  }

  /**
   * Removes and returns the head of the queue. Throws exception if empty.
   *
   * @return the first string in the queue
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * Returns the head of the queue without removing it, or null if the queue is empty.
   *
   * @return the first string in the queue, or null
   */
  @Override
  public String peek() {
    String element;
    if (!elements.isEmpty())
      element = elements.getFirst();
    else
      element = null;

    return element;
  }

  /**
   * Returns the head of the queue without removing it. Throws exception if empty.
   *
   * @return the first string in the queue
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}