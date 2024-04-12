package com.FrameWork.javaFiles;

public class Task01 {



    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings
    are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello"
    and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
     */


    public static void main(String[] args) {
        System.out.println(minCat("Hello","Hi"));
    }

    private static String minCat(String str1,String str2) {
      String result ="";
        if(str1.length() > str2.length()){
            result = str1.substring(1,str2.length()+1) + str2;
        }else{
            result = str1 + str2.substring((str1.length()-3));
        }

        return result;
    }
}
