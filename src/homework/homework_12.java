package homework;

import java.util.Scanner;

public class homework_12 {
//    -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
//            - based on the point the code should automatically determine the grade of Student with the full name of the student
//- This should be done for each student
//- Assuming we do not know how many student are there but your code should still handle this situation
//-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
//- When the point is between 90 to 100 the grade should be A
//- When the point is between 80 to 90(excluded) the grade should be B
//- When the point is between 70 to 80(excluded) the grade should be C
//- When the point is between 60 to 70 (excluded) the grade should be D
//- When the point is less than 60 the grade should be F
//- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter Student's First name");
        String name = scan.nextLine();

        System.out.println("Please enter Student's Last name");
        String Lastname=scan.nextLine();

        System.out.println("Please enter the point student received from the exam.");
        int point= scan.nextInt();
        char grade='W' ;
        if (point>=90 && point<=100){
            grade='A';
        }else if (point>=80 && point<90){
            grade='B';
        }else if (point>=70 && point<80){
            grade='C';
        }else if (point>=60 && point<70){
            grade='D';
        }else if (point<60){
            grade='F';
        }else {
            System.out.println("invalid point");
        }

        System.out.println("First name: "+name+" Last name: "+Lastname+" grade:"+grade);






    }

}
