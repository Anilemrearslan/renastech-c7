package day20_Methods;

public class Topic5_FirstMethod {

    public static void printName(){
        System.out.println("My name is Anil");// code block
    }//printName

    public static void main(String[] args) {

        System.out.println("this is the main method execution");

         printName();
         printLastName();

        System.out.println("this is in the main");

    }//main

    public static void printLastName(){
        System.out.println("My last name is Arslan");//code block
    }//printLastName

}//class
