/**
 * The SelectionSort class provides a static method to sort an array of integers using the selection sort algorithm.
 */
public class SelectionSort {
    
    /**
     * Sorts the specified array of integers in ascending order using the selection sort algorithm.
     * 
     * @param arr the array of integers to be sorted
     */
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
