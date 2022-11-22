package homework;

import CustomClassesForHomework.StudentINFORMATION;

public class homework_39 {
//    Write a code where it calls a method in the different Package and class where
//    it prints your first name and the last name, and returns to your age to be printed.
//
//    Please Create 2 packages. Your class will be in a package and your main application will be in another package.
//    Your age variable will be private and has a default value of 34.
//    Create a method called SetNameandLastNameandReturnAge with 2 parameters. Return the Age variable.
//    After returning it, print it to screen.
//    You can create a constructor and set values there or not. It is OPTIONAL.

    public static void main(String[] args) {

        StudentINFORMATION newStudent = new StudentINFORMATION();

        newStudent.name="Anil";
        newStudent.lastName="Arslan";
        int age=newStudent.SetNameandLastNameandReturnAge(newStudent.name,newStudent.lastName);

        System.out.println(newStudent.name+" "+newStudent.lastName+"'s age is "+age);


    }
}
