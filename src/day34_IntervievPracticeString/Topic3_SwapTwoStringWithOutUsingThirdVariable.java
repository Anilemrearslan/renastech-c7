package day34_IntervievPracticeString;

public class Topic3_SwapTwoStringWithOutUsingThirdVariable {
    public static void main(String[] args) {
        String a = "Benjamin";
        String b= "Ali";

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // do something
        // a+b-a=b


        a = a + b;
        //a = HelloRenasTech; length = 14
        // b = RenasTech;  length = 9

        // substring(0,5)

        b= a.substring(0,a.length()-b.length());

        //a = HelloRenasTech;
        //b = Hello

        a= a.substring(b.length());

        System.out.println("*******************");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
