package day04_Operators;

public class topic4_UnaryOperations {

    public static void main(String[] args) {
        //(+) does not have any effect on the value//100, +100, -70 , +-70

        int anum= 900;

        anum=+anum;
        System.out.println(anum);

        int anum2= -9000;
        anum2= +anum2;

        System.out.println(anum2);

        //(-) converts to opposite sign

        int anum3= -788;
        anum3=-anum3;
        System.out.println("the anum3 is: "+ anum3);

        int anum4= 345;
        anum4= -anum4;
        System.out.println("the value of anum4: "+anum4);

        //(++) increase by one
        int number= 94;
        number++;
        System.out.println(number);
        number++;
        System.out.println(number);
        ++number;
        System.out.println("new value is: "+ number);

        //(--) decrease by one

        int anum6= 94;
        anum6--;
        System.out.println(anum6);
        --anum6;
        System.out.println(anum6);
    }
}
