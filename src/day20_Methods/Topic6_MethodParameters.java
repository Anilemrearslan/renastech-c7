package day20_Methods;

public class Topic6_MethodParameters {

    public static void main(String[] args){

        MyMethod("Anil",23);
        System.out.println("cont from here");

        System.out.println("*****************************************");

        MyMethod("amer",22);
        System.out.println("*****************************************");
        MyMethod("Nawras",30);
    }

    public static void MyMethod(String name,int age){// Input parameters - have to have the datatype and the name
        System.out.println("my name is "+name);
        System.out.println("I am "+age+" years old");
    }
}
