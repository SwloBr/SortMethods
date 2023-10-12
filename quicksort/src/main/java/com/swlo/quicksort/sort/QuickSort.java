package com.swlo.quicksort.sort;

public class QuickSort {

    public int[] sort(int[] array, int start, int end) {
        if (start < end) {
            // Select the pivot
            int pivot = array[(start + end) / 2];

            // Partition the array into two subarrays, one for the elements smaller than the pivot and one for the elements greater than the pivot
            int i = start;
            int j = end;
            while (i <= j) {
                // While the current element of the left subarray is smaller than the pivot, update the left subarray index
                while (array[i] < pivot) {
                    i++;
                }

                // While the current element of the right subarray is greater than the pivot, update the right subarray index
                while (array[j] > pivot) {
                    j--;
                }

                // If the indexes have not crossed, swap the elements
                if (i <= j) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;

                    // Update the indexes
                    i++;
                    j--;
                }
            }

            // Recursively call quick sort for the two subarrays
            int[] subarray1 = sort(array, start, j);
            int[] subarray2 = sort(array, i, end);

            // Combine the two sorted subarrays
            int[] sortedArray = new int[subarray1.length + subarray2.length];
            System.arraycopy(subarray1, 0, sortedArray, 0, subarray1.length);
            System.arraycopy(subarray2, 0, sortedArray, subarray1.length, subarray2.length);

            return sortedArray;
        } else {
            // The array has a single element
            int[] sortedArray = new int[1];
            sortedArray[0] = array[start];
            return sortedArray;
        }
    }

}
