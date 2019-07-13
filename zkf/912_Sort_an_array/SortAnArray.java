/**
 * Selection sort approach.
 */
import java.util.Arrays;

public class SortAnArray {
    /**
     * Find and return the smallest integer in an INPUT array starting from index START.
     * @param input - The array from which we want to find a smallest item.
     * @param start - The starting index of the part of array we want to search.
     * @return - The smallest integer's index.
     */
    public static int findSmallestIndex(int[] input, int start) {
        int smallestIndex = start;
        for (int i = start + 1; i < input.length; i += 1) {
            if (input[smallestIndex] > input[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * Swap two items in an array destructively.
     * @param input - Input array.
     * @param a - The index of an item to be swapped.
     * @param b - The index of the other item to be swapped.
     */
    public static void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    /**
     * Do selection sort non-destructively.
     * @param input - Array we want to sort.
     * @return - The sorted copy of the input array.
     */
    public static int[] sortArray(int[] input) {
        int[] copy = Arrays.copyOf(input, input.length);
        sortArrayHelper(copy, 0);
        return copy;
    }

    /**
     * Sort the remaining unsorted part of an array.
     * @param input - Array to be sorted.
     * @param start - Start index of the remaining unsorted part of the array.
     */
    public static void sortArrayHelper(int[] input, int start) {
        if (start == input.length - 1) {
            return;
        }
        int smallestIndex = findSmallestIndex(input, start);
        swap(input, start, smallestIndex);
        sortArrayHelper(input, start + 1);
    }
}