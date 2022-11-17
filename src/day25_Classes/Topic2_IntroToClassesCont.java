package day25_Classes;

import java.util.Scanner;

public class Topic2_IntroToClassesCont {

    public static void main(String[] args) {
        StudentRegistrationForm MyForm = new StudentRegistrationForm();
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your name: ");
        MyForm.Name = scan.nextLine();

        System.out.println("Please enter your Surname: ");
        MyForm.SurName = scan.nextLine();

        System.out.println("Please enter your Age: ");
        MyForm.Age = scan.nextInt();scan.nextLine();

        System.out.println("Please enter your gender: ");
        MyForm.Gender = scan.nextLine();//we can use scan.nextLine(); after NextInt or Next only

        MyForm.PrintRegistrationForm();
    }
}

class StudentRegistrationForm{
    //fields
    String Name;
    String SurName;
    int Age;
    String Gender;

    //Methods
    void PrintRegistrationForm(){
        System.out.println("name : "+Name);
        System.out.println("Surname : "+SurName);
        System.out.println("Age : "+Age);
        System.out.println("Gender : "+Gender);
    }
}
