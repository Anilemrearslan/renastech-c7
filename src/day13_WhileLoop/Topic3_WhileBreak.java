package day13_WhileLoop;

public class Topic3_WhileBreak {

    public static void main(String[] args) {
        //Print all the number between 1 to 10 but when the number is 5 break the loop

        int start=1;
        while(start<10){

            System.out.println("the number are: "+start);
            if (start==5){
                break;
            }

            start++;
        }

        //Print all the characters in the string value of "Nawras" but break it when there is a char 'a'

        String name = "Nawras";
        int i=0;
        while(i<name.length()){

              if (name.charAt(i)=='a'){
                break;
            }
            System.out.println("the char at index "+i+" is "+name.charAt(i));
            i++;
        }












    }
}
