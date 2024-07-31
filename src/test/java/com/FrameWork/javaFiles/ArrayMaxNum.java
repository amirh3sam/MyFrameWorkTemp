package com.FrameWork.javaFiles;

import java.util.Arrays;

public class ArrayMaxNum {

    public static void main(String[] args) {
         int[] arr = {4,1,2,4,6,0};
        System.out.println(maxNum(arr));

    }


    public static int maxNum(int[] inputArray){

       int max  = inputArray[0];

        for (int each : inputArray) {
            if( each > max ){
                max = each;
            }
        }
        return max;
    }
}
