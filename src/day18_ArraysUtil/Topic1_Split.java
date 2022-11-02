package day18_ArraysUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic1_Split {

    public static void main(String[] args) {
        // split() method in Arrays Util, it creates a String Array based on the given String expression

        String names="Ziya Hrakar Nilufer Sena";
        System.out.println("the String name is : "+names);
        String [] nm=names.split(" ");
        System.out.println("nm contains: "+ Arrays.toString(nm));
        System.out.println("the length of nm Array is: "+nm.length);

        System.out.println("***************************************************");

        String nums="1234517619871";
        String [] numbers = nums.split("1");

        System.out.println("the numbers array is: "+Arrays.toString(numbers));

        System.out.println("***************************************************");

        String var="ThisisjustaString";
        String [] var1=var.split("");
        System.out.println("the var1 values: "+Arrays.toString(var1));

        System.out.println("***************************************************");

        String forbid = "Thisisjust a TEST";
        String [] tst = forbid.split("");// you can NOT use (*,?,+) on the split

        String var2="THISISATESTFORALI";
        String [] test = var2.split("",5);
        System.out.println("the test Array value is: "+ Arrays.toString(test));

        String var3 = "This is just a test but I want to try again";
        String [] test1= var3.split(" ",3);
        System.out.println("the test1 values: "+Arrays.toString(test1));





    }//main
}//class
