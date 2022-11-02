package day18_ArraysUtil;

import java.util.Arrays;

public class Topic2_toCharArray {

    public static void main(String[] args) {
        String name= "This is + * Ziya Yilmaz";
        char[]ch=name.toCharArray();// It returns to char array with every single character/char in the String

        System.out.println("this is char Arrays: "+ Arrays.toString(ch));

        String test="This is a Test";
        String [] strArray = test.split("");//{"T","h","i","s"," ",..........}
        char [] ChArray = test.toCharArray();//{'T','h','i',..........}

    }
}
