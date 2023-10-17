package com.Aditya.selectionsort;

import com.Aditya.sort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort.sort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
