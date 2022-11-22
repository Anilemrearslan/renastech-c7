package Day27_ClassesAndInheritance;

import CustomClasses.StudentClass;

public class Topic2_ClassesExample {

    public static void main(String[] args) {
        // we will create 2 Students
        // we will give them some Homeworks
        //we will point their Homeworks
        // we will check if they passed or not

        StudentClass FirstStudent = new StudentClass();
        FirstStudent.Name = "Hayri";
        FirstStudent.StudentNumber = "1";

        FirstStudent.AddHomeworkResult(50);
        FirstStudent.AddHomeworkResult(5);
        FirstStudent.AddHomeworkResult(23);
        FirstStudent.AddHomeworkResult(80);

        StudentClass SecondStudent = new StudentClass();
        SecondStudent.Name = "George";
        SecondStudent.StudentNumber = "2";

        SecondStudent.AddHomeworkResult(90);
        SecondStudent.AddHomeworkResult(98);
        SecondStudent.AddHomeworkResult(87);


        if (FirstStudent.GetMean()>=70){
            System.out.println(FirstStudent.Name+" passed");
        }
        else {
            System.out.println(FirstStudent.Name+" Failed");
        }


        if (SecondStudent.GetMean()>=70){
            System.out.println(SecondStudent.Name+" passed");
        }
        else {
            System.out.println(SecondStudent.Name+" Failed");
        }






    }
}
