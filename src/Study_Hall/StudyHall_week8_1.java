package Study_Hall;

public class StudyHall_week8_1 {

    //static String input ="BIBOBOBPIPDUD";

    public static void main(String[] args) {


        System.out.println(reverseString("RenasTech"));
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        caculatePalindrome();

    }
//Write a code where user is being asked to enter a word,
// find home many 3 character palindrome substrings are in the given Word and print each one of them
// ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD" there are 6 Palindrome three Char substring)

    public static void caculatePalindrome(){

        String input ="BIBOBOBPIPDUD";
        int count=0;
        for (int i = 0; i <input.length() -2 ; i++) {

            String temp = input.substring(i, i+3);

            if (temp.equals(reverseString(temp))){
                count++;
            }

        }
        System.out.println("polindrome count is: "+count);

    }



    private static String reverseString(String string){

        String temp="";

        for (int i = string.length()-1 ; i >=0 ; i--) {
            temp += string.charAt(i);
        }
        //System.out.println(temp);
        return temp;
    }





    public static String helloWorld(int param1){

       if (param1 % 2== 0){
           return "hello";
       }else {
           return "world";
       }

    }




}
