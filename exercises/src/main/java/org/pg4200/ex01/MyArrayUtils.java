package org.pg4200.ex01;

public class MyArrayUtils implements ArrayUtils {

    /**
     * @param array
     * @return the minimum value in the array
     * @throws IllegalArgumentException if input is null or empty
     */
    @Override
    public int min(int[] array) throws IllegalArgumentException {
        testSize(array);
        int result = Integer.MAX_VALUE;
        for (int m:array
             ) {
            if (m<result) {
                result = m;
            }
        }
        return result;
    }

    /**
     * @param array
     * @return the maximum value in the array
     * @throws IllegalArgumentException if input is null or empty
     */
    @Override
    public int max(int[] array) throws IllegalArgumentException {
        testSize(array);
        int result = Integer.MIN_VALUE;
        for (int m:array
        ) {
            if (m>result) {
                result = m;
            }
        }
        return result;
    }
    void testSize(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Null or empty arrays not allowed");
    }

    /**
     * @param array
     * @return the arithmetic average of the values in the array
     * @throws IllegalArgumentException if input is null or empty
     */
    @Override
    public double mean(int[] array) throws IllegalArgumentException {
        testSize(array);
        int returnValue = 0;
        for (int i:array) {
            returnValue += i;
        }
        return returnValue/array.length;
    }
}
