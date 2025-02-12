package lib.interfaces;

public interface OrderedListADT<T extends Comparable<T>> extends ListADT<T> {

  /**
   * Adds the specified element to this list at the proper location.
   *
   * @param element the element to be added to this list.
   */
  public void add(Comparable element);
}