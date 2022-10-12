package day05_IfElseStatement;

public class topic4_IfStatementContinue {

    public static void main(String[] args) {

        // write a code where it checks when 2 numbers are subtracts if the result is negative or positive
        int num1= 9;
        int num2= 9;

        int ans= num1-num2;

        if (ans>0){
            System.out.println("the answer is positive and the answer: "+ans);
        }
        if (ans<0){
            System.out.println("the answer is negative and the answer: "+ans);
        }
        if (ans == 0){
            System.out.println("The answer is 0 ");
        }
    }
}
