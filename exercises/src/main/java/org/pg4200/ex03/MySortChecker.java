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

        if(original == null && sorted == null){
            return true;
        }

        if(original == null || sorted == null){
            return false;
        }

        if(original.length != sorted.length){
            return false;
        }

        //null elements?
        for(int i=0; i<sorted.length; i++) {
            if(sorted[i]==null || original[i]==null){
                return false;
            }
        }

        //is it sorted?
        for(int i=0; i<sorted.length-1; i++){
            if(sorted[i].compareTo(sorted[i+1]) > 0){
                return false;
            }
        }

        //is it a permutation?
        for(int i=0; i<sorted.length; i++) {

            T value = sorted[i];
            int originalCount = 0;
            int sortedCount = 0;

            for(int j=0; j<sorted.length; j++) {
                if(sorted[j].equals(value)){
                    sortedCount++;
                }
                if(original[j].equals(value)){
                    originalCount++;
                }
            }
            if(originalCount != sortedCount){
                return false;
            }
        }

        return true;
    }
}
