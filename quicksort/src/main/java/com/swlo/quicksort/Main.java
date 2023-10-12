package com.swlo.quicksort;

import com.swlo.core.SortInterface;
import com.swlo.core.utils.ArchiveUtils;
import com.swlo.quicksort.sort.QuickSort;

public class Main {
    private static ArchiveUtils archiveUtils = new ArchiveUtils();
    private static SortInterface sort = new QuickSort();

    public static void main(String[] args, String inputFilePath, String outputFilePath) {

        int[] unsortedArray = archiveUtils.readFile(inputFilePath);

        long initTimer = System.currentTimeMillis();

        int[] sortedArray = sort.sort(unsortedArray);

        long closeTimer = System.currentTimeMillis();

        archiveUtils.writeFile(outputFilePath, sortedArray, "Quick Sort", closeTimer - initTimer);

    }

}