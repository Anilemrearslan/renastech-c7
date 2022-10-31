package day16_Arrays;

public class Topic1_Arrays {

    public static void main(String[] args) {
        //variable:
        //DateType name = value;


        //Arrays: are the containers where they hold multiples in the data types
        //Datatype [] name={value1,value2,value3}


        int [] array1 ={78,23,91,34};

        //In arrays index starts from 0

        int[] array2={67,          90,             28,         10};
        //the index   index0    index1           index2       index3


        //if i want to get the number in index 0, ==> array2[0]
        System.out.println("the first number in array is: "+array2[0]);
        System.out.println("the second number in array is: "+array2[1]);
        System.out.println("the third number in array is: "+array2[2]);
        System.out.println("the fourth number in array is: "+array2[3]);

        int var3=array2[2];
        System.out.println("the var3 value is: "+var3);

        System.out.println("*****************************************");


        //boolean data type arrays
        boolean[] boolArray={true,false,true,true};
        System.out.println("the value in index 3 in boolArray is: "+boolArray[3]);

        boolean var = boolArray[1];
        System.out.println("the var value is: "+var);

        System.out.println("*****************************************");

        //double data type arrays

        double[] dobArray={90,65.8778,23}; //90= 90.00000000000
        System.out.println("the value in index 0; "+dobArray[0]);

        System.out.println("*****************************************");

        //String arrays
        String [] StringArrayNames={"Cheesus", "Harakar", "Ziya","Nelly",null};

        System.out.println("the name is: "+StringArrayNames[3]);
        System.out.println("the value of index 4; "+StringArrayNames[4]);






    }//main
}//class
