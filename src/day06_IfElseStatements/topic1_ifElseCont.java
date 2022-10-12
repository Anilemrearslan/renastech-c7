package day06_IfElseStatements;

public class topic1_ifElseCont {

    public static void main(String[] args) {

        //write a code where determines students grade based on the points they received.
        // 90 - 100 is A
        //80 -90 is B
        //70 - 80 is C
        //60 - 70 is D
        // rest is F
        // also if the given point is greater than 100 or less than 0 print "not valid point"


//benim denemem
//          double point=100;
//        if (point >100 || point<0){
//            System.out.println("not valid point");
//        }else if(point<=100 && point>=90) {
//            System.out.println("grade is A");
//        }else if (point<90 && point>=80){
//            System.out.println("grade is B");
//        }else if(point<80&& point>=70){
//            System.out.println("grade is C");
//        }else if (point<70 && point>=60){
//            System.out.println("grade is D");
//        }else{
//            System.out.println("grade is F");
//        }
        double point=100;
        if (point <0 || point>100){
            System.out.println("Not valid point");
        }else if (point>=90){
            System.out.println("the grade is A");
        }else if (point>=80){
            System.out.println("the grade is B");
        }else if(point>=70){
            System.out.println("the grade is C");
        }else if(point>=60){
            System.out.println("the grade is D");
        }else {
            System.out.println("the grade is F");
        }










    }
}
