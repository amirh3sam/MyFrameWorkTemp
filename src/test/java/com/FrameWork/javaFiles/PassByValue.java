package com.FrameWork.javaFiles;

public class PassByValue {


    /**
     * In Java, all parameters are passed by value. However, this can be a bit confusing when it comes to objects. Here's a concise explanation:
     * For primitive types (int, double, boolean, etc.):
     * A copy of the value is passed to the method.
     * Changes to the parameter inside the method do not affect the original variable.
     *
     */

    public static void modifyPrimitive(int x) {
        x = 10; // This change is local to the method
    }

    public static void main(String[] args) {
        int num = 5;
        modifyPrimitive(num);
        System.out.println(num); // Still prints 5

        int n = 4;
        buyByZipcode(n);
        System.out.println("n after method = " + n);
        StringBuilder str = new StringBuilder("Hello");
        modifyObject(str);
        System.out.println(str); // Prints "Hello World"
    }
    public static void buyByZipcode(int zipcode) {
        System.out.println("Looking in zipcode " + zipcode);
        zipcode = zipcode + 10;
    }


    /**
     * For objects:
     * A copy of the reference (memory address) is passed to the method.
     * The method receives a copy of the reference, not the original reference itself.
     * Changes to the object's state are reflected in the original object.
     * Reassigning the parameter to a new object does not affect the original reference.
     */
    public static void modifyObject(StringBuilder sb) {
        sb.append(" World"); // Modifies the original object
        sb = new StringBuilder("Hello Universe"); // Local reassignment, doesn't affect original
    }

}
