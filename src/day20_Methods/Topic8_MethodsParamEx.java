package day20_Methods;

public class Topic8_MethodsParamEx {

    //write a method where it takes array of integers and print the sum of all the elements in the array
    public static void sumArray(int[] numbers){
        int sum=0;
        for (int num:numbers){
            sum+=num;
        }
        System.out.println("the sum of all the numbers in the array is: "+sum);
    }
    public static void main(String[] args) {
        int [] arrayInt = {56,7,8,23,4,5,6,3,2,5,6,8};
        sumArray(arrayInt);
        System.out.println("++++++++++++++++++++++++++++");
        int[] nums={78,-98};
        sumArray(nums);

    }

}
