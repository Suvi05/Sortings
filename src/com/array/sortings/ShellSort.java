//Selection Sort's Implementation
package com.array.sortings;

public class ShellSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {    //1st Extra Line than insertion Sort
            //Above loop is the only preliminary sorting and when  the value of gap will become 1,
            // the below code will start working like insertion sort

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];

                int j = i;  //This j is being used for traversing the array

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j = j - gap;   //2nd Extra Line than insertion Sort
                }
                intArray[j] = newElement;  //Insertion Sort
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
