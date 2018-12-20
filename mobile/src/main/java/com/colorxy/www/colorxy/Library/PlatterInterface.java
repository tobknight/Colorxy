package com.colorxy.www.colorxy.Library;

/**
 * Interface
 *
 * @author Tobknight
 */
public interface PlatterInterface<E> {
    /**
     * Add
     */
    void add(E element);

    /**
     * Get
     */
    E get(int idx);

    /**
     * Exchange element by index in array
     */
    void exch(int i, int j);

    /**
     * Delete
     */
    void delete(int idx);

    /**
     * Delete All element
     */
    void deleteAll();

    /**
     * Size
     */
    int size();
}
