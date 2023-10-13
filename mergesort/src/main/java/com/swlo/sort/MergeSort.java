package com.swlo.sort;

import com.swlo.core.SortInterface;

import java.util.Arrays;

public class MergeSort implements SortInterface{

    @Override
    public int[] sort(int[] vetor) {
        return sorting(vetor);
    }


    public int[] sorting(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int[] left = sorting(Arrays.copyOfRange(array, 0, array.length / 2));
        int[] right = sorting(Arrays.copyOfRange(array, array.length / 2, array.length));

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }
}
