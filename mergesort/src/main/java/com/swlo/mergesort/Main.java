package com.swlo.mergesort;

import com.swlo.core.SortInterface;
import com.swlo.core.utils.ArchiveUtils;
import com.swlo.sort.MergeSort;
import org.apache.commons.cli.*;

public class Main {
    private static ArchiveUtils archiveUtils = new ArchiveUtils();
    private static SortInterface sort = new MergeSort();

    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("inputFilePath", true, "Input file path");
        options.addOption("outputFilePath", true, "Output file path");

        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);

            String inputFilePath = cmd.getOptionValue("inputFilePath");
            String outputFilePath = cmd.getOptionValue("outputFilePath");

            int[] unsortedArray = archiveUtils.readFile(inputFilePath);

            long initTimer = System.currentTimeMillis();

            int[] sortedArray = sort.sort(unsortedArray);

            long closeTimer = System.currentTimeMillis();

            archiveUtils.writeFile(outputFilePath, sortedArray, "Merge Sort", closeTimer - initTimer);
        } catch (ParseException e) {
            System.err.println("Error for process arguments: " + e.getMessage());
        }
    }
}
