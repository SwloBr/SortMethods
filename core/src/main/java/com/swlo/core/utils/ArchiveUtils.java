package com.swlo.core.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArchiveUtils {


    public static void writeFile(String url, int[] array) {
        Path path = Paths.get(url);

        String text = Arrays.toString(array);

        byte[] byteText = text.getBytes();

        try {
            Files.write(path, byteText);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    public static void writeFile(String stringPath, String array) {
        Path path = Paths.get(stringPath);
        byte[] byteText = array.getBytes();

        try {
            Files.write(path, byteText);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    public static void writeFile(String stringPath, int[] array, String algorithmName, long executionTime, long comparativesQuantity, long movementsQuantity) {
        Path path = Paths.get(stringPath);

        int milliSeconds = (int) (executionTime % 1000);
        int seconds = (int) (executionTime / 1000) % 60;
        int minutes = (int) (executionTime / 1000) / 60;
        int hour = (int) (executionTime / 3600000);

        String time = String.format("%02d:%02d:%02d:%03d", hour, minutes, seconds, milliSeconds);


        String text = "Algorithm: " + algorithmName
                + "Execution Time: " + time
                + "\nComparatives Quantity: " + comparativesQuantity
                + "\nMovements Quantity: " + movementsQuantity
                + "\n\n";


        String output = text + Arrays.toString(array);

        byte[] arrayBytes = output.getBytes();

        try {
            Files.write(path, arrayBytes);
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }





    public int[] readFile(String stringPath) {
        Path archivePath = Paths.get(stringPath);
        String stringNumber = "";

        try {
            byte[] text = Files.readAllBytes(archivePath);
            stringNumber = new String(text);

        } catch (Exception e) {
            System.out.println("File can`t be read!");
        }

        List<Integer> list = new ArrayList<>();

        String num = "";

        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) != '['
                    && stringNumber.charAt(i) != ']'
                    && stringNumber.charAt(i) != ','
                    && stringNumber.charAt(i) != ' ') {

                num += stringNumber.charAt(i);

            } else {
                if (num != "") {
                    int number = Integer.parseInt(num);
                    list.add(number);
                    num = "";
                }
            }
        }

        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

}