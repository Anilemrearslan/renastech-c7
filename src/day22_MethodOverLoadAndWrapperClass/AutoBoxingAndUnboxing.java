package day22_MethodOverLoadAndWrapperClass;

public class AutoBoxingAndUnboxing {

    public static void main(String[] args) {
        Integer i = new Integer(10);

        //Unboxing the Object
        int i1=i;
        System.out.println(i1);

        //Boxing
        int i2= 5;
        Integer i3= i2;

    }
}
