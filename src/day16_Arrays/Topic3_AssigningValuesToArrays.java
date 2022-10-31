package day16_Arrays;

public class Topic3_AssigningValuesToArrays {

    public static void main(String[] args) {

        int[] intArray={98,23,4,5,1,23};//duplicate values are allowed in arrays
        //getting the value in index 4
        int val = intArray[4];
        System.out.println("the value in index 4 or in var variable: "+val);

        System.out.println("************************************************************************");

        int[]array1=new int[4];//{0,0,0,0}
        array1[0] = 78; //{78,0,0,0}
        System.out.println("the value in index 0 is : "+array1[0]);
        System.out.println("the value in index 1 is : "+array1[1]);
        array1[1]=90;
        System.out.println("the value in index 1 is : "+array1[1]);
        array1[2]=76;
        array1[3]=12;
        //array1[4]=79; this will result exception to ArrayIndexOutOfBound
        //array1 ={78,90,76,12}

        System.out.println("************************************************************************");

        char[] chArray= new char[5];
        chArray[0]='d';
        chArray[1]='c';
        chArray[2]=' ';
        chArray[3]='o';
        chArray[4]='2';//{'d','c',' ','o','2'}

        System.out.print("the char at index 3 is: "+chArray[0]);
        System.out.print("the char at index 3 is: "+chArray[1]);
        System.out.print("the char at index 3 is: "+chArray[2]);
        System.out.print("the char at index 3 is: "+chArray[3]);
        System.out.print("the char at index 3 is: "+chArray[4]);



    }
}
