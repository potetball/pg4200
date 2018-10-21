package org.pg4200.ex03;

public class MySortChecker implements SortChecker {
    /**
     * Check if "sorted" is a sorted copy of the
     * "original" array.
     * <p>
     * Sorting is undefined for "null" elements.
     * Therefore, if any of the input array contains null values,
     * this method returns false.
     *
     * @param original
     * @param sorted
     */
    @Override
    public <T extends Comparable<T>> boolean isSortedCopy(T[] original, T[] sorted) {
        if (original == null || sorted == null) return false;
        //first we need to sort the original, then we can compare it to see if its sorted
        for (int i = 0; i < sorted.length; i++) {
            if (original[i] != sorted[i]) {
                return false;
            }
        }
        return false;
    }
}
