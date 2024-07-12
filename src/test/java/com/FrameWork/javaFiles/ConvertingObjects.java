package com.FrameWork.javaFiles;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingObjects {

    public static void main(String[] args) {


        /** if we have ""String"" and want to  ------->  ""Array"" **/

        // first we can do split method

        String name = "Amirhesam Bad";

        String[] nameInArray = name.split(" ");

        System.out.println(Arrays.toString(nameInArray));


        // second way is using toCharArray to get each character

        String name2 = "my world";
        char[] name2Array = name2.toCharArray();
        for (char each : name2Array) {
            System.out.println(each + " ");

        }

        /** if we have ""String"" and want to  ------->  ""ArrayList"" **/


        String str = "Java Python Ideas";

        ArrayList<String> listNames = new ArrayList<>(Arrays.asList(str));

        System.out.println(listNames);


        /** if we have ""Array"" and want to  ------->  ""String"" **/
        String[] str3 = {"Jake", "Sam", "dave"};
        String resultString = "";

        for (String each : str3) {
            resultString += each + " ";
        }

        System.out.println(resultString.trim());


        /** if we have ""ArrayList"" and want to  ------->  ""String"" **/

        ArrayList<String> allNames = new ArrayList<>(Arrays.asList("ALi", "Amir", "Sami"));

        String resultAllName = "";

        for (int i = 0; i < allNames.size(); i++) {
            resultAllName += allNames.get(i) + " ";
        }
        System.out.println(resultAllName.trim());


    /**
     * if we have ""ArrayList"" and want to  ------->  ""Array""
     **/

    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

    Integer[] numsArray = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numsArray));
    }
}
