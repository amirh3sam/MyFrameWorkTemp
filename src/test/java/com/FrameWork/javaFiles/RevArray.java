package com.FrameWork.javaFiles;

public class RevArray {

    public static void main(String[] args) {
        System.out.println("Reversed = " + RevArrays("Hello world"));

    }

    public static String RevArrays(String myArr) {

        String[] ArrStr = myArr.split(" ");
        String reversed = "";
        for (int i = ArrStr.length - 1; i >= 0; i--) {

            reversed += ArrStr[i] + " ";

        }
        return reversed.trim();
    }


}