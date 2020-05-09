//Bubble Sort's Implementation
package com.array.sortings;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++)
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
        }
        //Doubt: What if intArray[i] is not greater than intArray[i+1]
        //Solution: Then without swapping it will come out of the loop and lastUnsortedIndex will get decremented

        System.out.println("Sorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        //we are putting it as static because we will call it in main method
        //int[] array - is the array  we are sorting
        //i& j - indices of the elements which we want to swap

        if (i == j) {
            return;
            //if i and j are equals than we don't have anything to swap
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
//The End