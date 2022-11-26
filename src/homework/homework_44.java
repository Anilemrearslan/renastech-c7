package homework;

import java.util.ArrayList;

public class homework_44 {
    /*
    Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all of the elements of the Arrays
arr1   =   {"A",   "B",   "C"};
arr2   =   {"D",   "E",   "F",   "G"};
result   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}

Please create a method with 2 String array parameters.
Return an ArrayList of String.
Method name is MergeArrays
You will merge two given array into an ArrayList.
     */
    public static void main(String[] args) {
        String[] Arr1 = {"A",   "B",   "C"};
        String[] Arr2 = {"D",   "E",   "F",   "G"};

        System.out.println(MergeArrays(Arr1, Arr2));
    }


    public static ArrayList<String> MergeArrays(String[]arr1, String[]arr2){
        ArrayList<String>NewArray = new ArrayList<>();
        String Each="";
        for (int i = 0; i < arr1.length; i++) {
            Each=arr1[i];
            NewArray.add(Each);
        }

        for (int i = 0; i < arr2.length; i++) {
            Each=arr2[i];
            NewArray.add(Each);
        }
        return NewArray;
    }
}
