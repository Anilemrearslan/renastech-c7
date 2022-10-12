package day05_IfElseStatement;

public class topic3_IfStatements {

    public static void main(String[] args) {

        int a=9;
        int b=9;
        int c=9;

        if (a>b && a>c){
            System.out.println("The highest number is a:"+a);
        }
        if (b>a && b>c){
            System.out.println("The highest number is b:"+b);
        }
        if (c>a && c>b){
            System.out.println("The highest number is c:"+c);
        }

        if (a==b && b==c){
            System.out.println("all the numbers are equal");
        }









    }
}
