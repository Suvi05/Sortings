//Merge Sort's Implementation
package com.array.sortings;

import java.util.Arrays;

public class JavaSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Arrays.sort(intArray);
        //It uses modified Quick Sort - Dual Pivot Quick Sort
        System.out.println("Sorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
