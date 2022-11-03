package day19_MultiDimensionArrays;

public class Topic7_FoorEachLoop {
    public static void main(String[] args) {
        String [] names={"Ziya","Ali","Nurettin","amer"};

        for (int i = 0; i < names.length; i++) {

            System.out.println("the name is: "+names[i]);

        }
        System.out.println("**********************************************");
        for (String name:names){

            System.out.println("name = " + name);


        }

        /*
        dor (Datatype varibleName:Collection){

        code block
        }

         */

        System.out.println("*******************************************");
        int [] numbers={3,4,5,6,12,12345,785};

        for (int num:numbers){

            if (num%2==0){
                System.out.println("number "+ num+" is even");
            }else {
                System.out.println("number "+ num+" is odd");
            }
        }










    }

}
