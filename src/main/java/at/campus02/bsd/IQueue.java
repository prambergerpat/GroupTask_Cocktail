package at.campus02.bsd;

/**
 * Represents an interface for a simple queue implementation.
 */

public interface IQueue {

  /**
   * Adds a object to the queue.
   * @param obj the object, which should be added to the queue
   * @return true if the process to add the object was successful, false if it was not successful
   */
  public abstract boolean offer(String obj);

  /**
   * Returns and removes the first element from the queue.
   * @return the element if it is existing, null if the element is not existing
   */
  public abstract String poll();

  /**
   * Returns and removes the first element from the queue.
   * @return the element if it is existing
   * @throws java.util.NoSuchElementException if the element is not existing
   */
  public abstract String remove();

  /**
   * Returns the first element without removing it from the queue.
   * @return the element if it is existing, null if the element is not existing
   */
  public abstract String peek();

  /**
   * Returns the first element without removing it from the queue.
   * @return the element if it is existing
   * @throws java.util.NoSuchElementException if the element is not existing
   */
  public abstract String element();
}