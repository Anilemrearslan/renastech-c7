package day16_Arrays;

public class Topic2_Arrays {

    public static void main(String[] args) {
        //we can define array with a size but not add any values

        //DataType [] name = new DataType[size/length]

        int [] intArray = new int[4]; // {0,0,0,0} // this will populate intArray with 0 values
        //because the default value for int is 0
        //0 is also default value for byte,short and long data types
        System.out.println("the index 0 value in intArray is: "+intArray[0]);
        System.out.println("the index 1 value in intArray is: "+intArray[1]);
        System.out.println("the index 2 value in intArray is: "+intArray[2]);
        System.out.println("the index 3 value in intArray is: "+intArray[3]);
        System.out.println("the index 4 value in intArray is: "+intArray);

        System.out.println("************************************************************************");

        double[] doubArray = new double[3];//{0.0 , 0.0 , 0.0} because 0.0 is the default value of the double
        //default value for double and float is 0.0
        System.out.println("the value of index 1 in doubArray: "+doubArray[1]);

        System.out.println("************************************************************************");

        char [] charArray = new char[4];//{ , , , }
        System.out.println("the default value of char : "+charArray[1]);

        System.out.println("************************************************************************");

        String[] StringArray = new String[3];// {null , null , null}
        System.out.println("the default value for String : "+StringArray[0]);

        //once array size or length is defined it cannot  be changed what you can do create another array and put all values
        //in the new array

    }
}
