package day21_MethodsAndMethodOverload;

public class MethodExample {

    public static void main(String[] args) {
        double average = calculateAverage(13,14);

        System.out.println(analyseAvarage(average));

        if(analyseAvarage(average) == "your grade is low, you need to study harder"){

            System.out.println("SUCCESS");
        }else {
            System.out.println("FAIL");
        }

        //Assertion = your grade is low, you need to study harder
    }

    //calculate average
    //2 input
    //mid-term, final
    private static double calculateAverage(double midTermExam, double finalExam){

        double average=(midTermExam+finalExam)/2;
        return average;
    }


    // analyseAverage
    //0-50 your grade is low, you need to study harder
    //50-75 your grade is not bad, but you can study more
    //75-100 your grade is perfect, keep studying

    private static String analyseAvarage(double average){

        String category="";

        if (average>=0 && average<=49.99){
            category="your grade is low, you need to study harder";
        }else if (average>=50 && average<=74.99){
            category="your grade is not bad, but you can study more";
        }else if (average>=75 && average<=100){
            category="your grade is perfect, keep studying";
        }else {
           category="invalid number entered please check your score";
        }

        return category;
    }









}
