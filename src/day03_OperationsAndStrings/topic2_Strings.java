package day03_OperationsAndStrings;

public class topic2_Strings {

    public static void main(String[] args) {

        //Strings are not primitive data type they are non-primitive data type
        //Datatype name = a value

        String name="ziya";
        System.out.println(name);

        String prag="this is a paragraph. I wanted to put this as well";

        System.out.println(prag);

        String spc="8967567hd+@$\"^&(";
        System.out.println(spc);

        String numbers="5678"; //this is not a number anymore
        System.out.println("numbers = " + numbers);

        // combine 2 text
        String txt1="This is text 1 ";
        String txt2="This is the text 2";
        String txt3=txt1+txt2;
        System.out.println(txt3);

        String number2="98 ";
        String number3="89 ";
        String number4=number2+number3;
        System.out.println(number4);

        System.out.println("this is hello world\t"+"This is second hello world "+ "this is third hello world ");

        int num = 89;
        System.out.println("this is the number from int: "+num);


    }
}
