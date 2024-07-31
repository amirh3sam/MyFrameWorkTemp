package com.FrameWork.javaFiles;

public class ArmStr {


    public static void main(String[] args) {


        int input = 153;
        System.out.println(isArmstrong(input));

    }

    public static boolean isArmstrong(int input) {

        String inputString = String.valueOf(input);

        int length = inputString.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int eachNum = Integer.parseInt(inputString.charAt(i)+"");

            double pow = Math.pow(eachNum,length);
            sum+=pow;

        }
        System.out.println(sum);
return sum == input;
    }
}
