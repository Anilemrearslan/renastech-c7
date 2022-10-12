package day03_OperationsAndStrings;

public class topic3_ArithmeticOperations {

    public static void main(String[] args) {

        //(+) Addition
        int num1=90;
        int num2=80;
        int num3=num1+num2;
        System.out.println("The result is: "+num3);
        System.out.println(num1+num2);
        System.out.println("this is result in different way"+num1+num2);
        System.out.println("this is result in different way"+(num1+num2));

        int num4=300;
        float num5=98.56f;

        float num6=num4+num5;
        System.out.println(num6);

        double num7=98.7654;
        int num8=900;
        double num9=num7+num8;
        System.out.println("the result for double_int is ="+ num9);

        //(-) subtraction

        int num10= 67;
        int num11= 9000;
        int result=num10-num11;
        System.out.println(result);

        //(*) multiplication
        int num12=95;
        int num13= 98;
        int result1=num12*num13;
        System.out.println("the result of multiplication is: "+ result1);

        double number=89.543;
        double number1=87;
        double number2=number*number1;
        System.out.println("the result is: "+number2);

        //(/) division

        int number3=89;
        int number4=40;
        float div=(float)number3/number4;// (int/int)
        System.out.println(div);

        double number5=89.546453687;
        double number6=3.876;
        double result2=number5/number6;//(double/double)
        System.out.println("the result is:" + result2);

        //(%) modulus (mod)//get the reminder of the division

        int number7=98;
        int number8=3;
        int result3= number7%number8;
        System.out.println(result3);











    }
}
