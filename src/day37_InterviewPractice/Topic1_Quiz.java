package day37_InterviewPractice;

public class Topic1_Quiz {

    public static void main(String[] args) {

        int i = 11;
        i= i++ + ++i;

        System.out.println(i);

        int a = 11 , b =22, c;
        c = a+b+a++ + b++ + ++a + ++b;

        //c = 11 + 22 + 11 + 22 + 13 + 24
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        i = 0;
        i= i++ - --i + ++i - i--;
//        i= 0++ - --i + ++i - i--; i=1;
//        i= 0 - 0 + ++i - i--;   i=0;
//        i= 0 - 0 + 1 - i--;   i=1;
//        i= 0 - 0 + 1 - i--;   i=1;
    }
}
