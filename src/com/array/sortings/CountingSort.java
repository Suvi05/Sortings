//Counting Sort's Implementation
package com.array.sortings;

public class CountingSort {
    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        System.out.println("Sorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {
        //counting sort assumes that whole array will fall in  the range of min to max in array
        int[] countArray = new int[(max - min) + 1]; //(eg- [(10-1)+1]
        //This array will keep the track of the count
        //This array has to be large enough to count each possible value
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
            //That's going to be index where to count each value
        }
        //Now after completing counting we have to put the values back into the input array
        int j = 0; //j will be used to write the  input array
        for (int i = min; i <= max; i++) {   //i will be used to traverse the countArray
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }

        }
    }
}
