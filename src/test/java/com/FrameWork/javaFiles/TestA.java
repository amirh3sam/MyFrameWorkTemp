package com.FrameWork.javaFiles;

public class TestA {


/*    ---->EscapeSequence
\" -> "
\n -> new line
\t -> tab
\' -> single quote
\\ -> prints \
 */
public static void main(String[] args) {

//find a number and replace it with nothing
/*
Regex, or regular expression, is a powerful tool used for pattern matching within strings. It allows you to search,
 match, and manipulate text based on specific patterns. For example, in testing, you might use regex to validate email
 formats or extract specific data from a string.
 Java supports various regex metacharacters and quantifiers, such as:
. (dot): Matches any character
^ : Matches the start of a line
$ : Matches the end of a line
\d : Matches a digit
\s : Matches a whitespace character
: Matches one or more occurrences
: Matches zero or more occurrences
 */
    String s4 = "AB12C54D3";
    System.out.println(s4.replaceAll("\\d",""));

    //reverse string
    String s = "java";
    StringBuilder st = new StringBuilder(s);
    s = st.reverse().toString();
    System.out.println("s = " + s);

    // palindrome with two pointer
    String str = "civic";
    boolean isPalindrome = true;
    for (int i = 0,j= str.length()-1; i < j; i++,j--) {
        if(str.charAt(i) != str.charAt(j)){
            isPalindrome= false;
            break;
        }
    }
    System.out.println("str = is Palindrome :" + isPalindrome);
}
}
