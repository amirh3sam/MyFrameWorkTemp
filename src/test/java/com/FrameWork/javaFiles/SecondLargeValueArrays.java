package com.FrameWork.javaFiles;

public class SecondLargeValueArrays {

    public static void main(String[] args) {

        int []  arr = {1,3,4,5,62,11};

        System.out.println(secondLargInt(arr));

    }

    private static int secondLargInt(int[] myArray) {

        int max = myArray[0];
        int secondMax = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            if(myArray[i] > max) {
                secondMax = max ;
                max= myArray[i];
            }else if(myArray[i] > secondMax){
                secondMax = myArray[i];
            }

        }
        return secondMax;
    }
}
