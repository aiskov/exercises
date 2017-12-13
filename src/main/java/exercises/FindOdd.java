package exercises;

public interface FindOdd {
    /**
     * Find element which occurs in array odd times.
     *
     * @param input array with values for check
     * @return first value which occurs odd times in input
     * @throws IllegalStateException if no value found
     * @throws IllegalArgumentException if input is null
     */
    int findIt(int... input);
}

