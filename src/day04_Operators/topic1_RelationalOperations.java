package day04_Operators;

public class topic1_RelationalOperations {

    public static void main(String[] args) {

        // "==" check if 2 things are equal
        boolean check= 2==8;

        System.out.println("The answer is: "+check);

        int a= 90;
        int b=110;
        boolean check1=a==b;
        System.out.println("is a equal to be: "+ check1);

        boolean check2=20==20;
        System.out.println(check2);

        //"<" check if one thing less than other

        boolean check3= 60 < 110;
        System.out.println("is 60 less than 100: "+check3);

        //">" check if one thing is greater than another to it

        boolean check4= 90>40000;
        System.out.println("is 90 greater than 40000:" + check4);

        //"<=" checks if one thing less than another or equal
        boolean check5 = 100<=500;
        System.out.println("is 100 less than 500 or equal to 500:"+check5);
        boolean check6= 900<=900;
        System.out.println("result: "+check6);

        //">=" checks if one thing greater than another or equal to it

        boolean check7=956>= 120;
        System.out.println("is 956 >= to 120"+ check7);


        //"!=" checks if 2 things are not equal

        boolean check8 =90!=90;
        System.out.println("not equal: "+ check8);

        //"!" convert to the opposite value

        boolean check9 = !(!(234!= 789)); //2*5+89(90-10)

        System.out.println("the value for check9: "+check9);

        boolean check10 = !(!(90==30)==!(98>98));
        System.out.println("the check10 is: "+check10);

    }
}
