package homework;

import java.util.Scanner;

public class homework_26 {
    //Write a code where it ask user to enter an integer number
    //- Reverse the given number and print the result
    //- Example input ( 5678 )
    //- Example output ( 8765)
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int reverse=0;

        while(number!=0){
            int reminder=number%10;//1234 ===> reminder==4
            reverse= reverse*10+reminder;// 0*10+4== 0+4=4 //now the value of the number 4
            number=number/10;//1234/10==123   //now value of the number 123
        }
        System.out.println("the reverse of the given number is: "+ reverse);


    }
}
