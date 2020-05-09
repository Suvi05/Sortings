package com.array.samples;

public class TestArray {
    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[5] = -22;

        //Another Way could be int[] intArray={20,35,-15,7,55,1,-22};

//        Doubt:
//
//        intArray[5] = 1;
//        intArray[5] = -22;
//
//        Output:
//       -22
//        0                    Why???

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
