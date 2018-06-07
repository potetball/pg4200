package org.pg4200.les01;

/**
 * In most programs, we need to store data, and then being able to retrieve it later on.
 * For example, we could need to store info about which items we selected in a shopping cart (eg Amazon),
 * preferred songs in a play list, etc.
 *
 * Why using an interface? Because there can be many different ways to implement such functionalities, but
 * for the client that uses such class, the implementation details are not important from the functionality
 * point of view.
 * But then, why having different implementations?
 * Reason: PERFORMANCE!!!
 * Based on how it is implemented, each operation will have a different cost (e.g., running time
 * and memory consumption).
 * So when you choose a specific implementation to use, such choice would be based
 * on which operations are expected to be used most.
 */
public interface MyStringContainerWithIndex {

    /**
     * Get the string stored in position defined by "index".
     * Indices starts at 0, and consecutive with no gaps, i.e., 0, 1, 2, 3, ...
     * like in an array
     *
     * Return "null" if index is invalid
     */
    String get(int index);

    /**
     * Add a new value to the collection, in the smaller available index (starting from 0).
     */
    void add(String value);

    /**
     * Get how many elements this collection has.
     */
    int size();
}
