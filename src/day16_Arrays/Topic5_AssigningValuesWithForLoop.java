package day16_Arrays;

public class Topic5_AssigningValuesWithForLoop {

    public static void main(String[] args) {
        //write a code where you define an integer array with size/length of 10 and assign each index with
        //even number Starting from 90
        //90 , 92,94 ,96,98,100 ,102,104,106,108

        //arr ={90 , 92,94 ,96,98,100 ,102,104,106,108}

        int[] arr= new int[10];

        int start=90;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=start;
            start+=2;
            System.out.println("arr[i] = " + arr[i]);
        }










    }
}
