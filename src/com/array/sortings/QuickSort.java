//Selection Sort's Implementation
package com.array.sortings;

public class QuickSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        quickSort(intArray,0, intArray.length);

        System.out.println("Sorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        //Means we have put the pivot onto its correct position and we have to rearrange everything around pivot
        // Means, smaller elements at its left and greater at right
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        //Partition Method
        //This is going to return the correct position of pivot in the sorted array
        //This is using first element as pivot
        int pivot = input[start];
        int i = start;  // i will traverse from left to right
        int j = end;    // j will traverse from right to left
        //We will stop when i and j will cross each  other.
        while (i < j) {
            //means they  have crossed
            while (i < j && input[--j] >= pivot) ;
            //Note: empty body loop
            //We are just using this loop to discrementing j until we find an element that's less than the pivot or j crosses i
            if (i < j) {
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot) ;
            //Note: empty body loop
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
