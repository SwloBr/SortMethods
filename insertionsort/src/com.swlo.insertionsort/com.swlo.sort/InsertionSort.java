package com.swlo.insertionsort.sort;

import com.swlo.core.SortInterface;

public class InsertionSort implements SortInterface {

    @Override
    public int[] sort(int[] array) {
        insertionSort(array);
        return array;
    }

    private void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
