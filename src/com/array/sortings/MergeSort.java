//Merge Sort's Implementation
package com.array.sortings;

public class MergeSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted Array");
        for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }

        mergeSort(intArray,0,intArray.length);

        System.out.println("Sorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    //20, 35, -15, 7, 55, 1, -22
    public static void mergeSort(int[] input, int start, int end) { //This method is to Sort/ Split
        if (end - start < 2) {
            //<2 means one, and as we know that single array element is always sorted
            //As it doesn't have anyone to compared with... the number itself is sub sufficient
            return;
        }

        //Now we have to break the array into parts
        int mid = (start + end) / 2;    //mid = (0+7)/2 = 3
        //int this "end" it is always +1 then the last valid index in the array
        mergeSort(input, start, mid);//Indices(0 to 2)
        //MergeSort on left array
        //This is recursive call, so when it will end... it would have handled whole left side of the array
        //Input will be the array always, because we are doing logical partitioning
        mergeSort(input, mid, end); //Indices (3 to 6)
        //MergeSort on right array
        merge(input, start, mid, end);
        //We always merge sorted/split partition
    }

    //20, 35, -15, 7, 55, 1, -22
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
            //As we know that we always Merge sorted partition.
            //So, mid is the first element of Right side array and
            //mid-1 is the last element of Left side array
            //This is the example of Shortest merging sort when both the files just have to be stick together
            //1st Optimisation
            //([mid-1]=1 and mid=7) //from the sorted array
            //Because it will be like sorting the already sorted array
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        //Creating temporary array  for merging
        while (i < mid && j < end) {
            //Means when either i gets finished... or j get finished we drop out, as everting else which has not
            // been destroyed or over come tinn now would got added up into the last
            temp[tempIndex++] = input[i] <= input[j]? input[i++]: input[j++];
            //we have <=(equals to) because merge sort is stable... if we will remove this... it will become unstable
        }

        System.arraycopy(input, i, input, start + tempIndex, mid-i);
        //tempIndex counts that how many elements we have handled
        //mid-i tells us the number of elements that we didn't copied over into the temp array from the left partition
        //2nd Optimisation (adding left over from right side directly to the array
        System.arraycopy(temp, 0 , input, start, tempIndex);
    }

}
