package day35_InterviewPracticeNumbers;

public class Topic1_CompressString {
    public static void main(String[] args) {
        // "AAABBBBBCCDDD"  -> 3A5B2C3D
        // write a method that compress given String
        CompressString("AAABBBBBCCDDD");
        System.out.println("");

        System.out.println("******************************");

        CompressString("aabccaaa");
    }

    public static void CompressString(String param1){
        // "AAABBBBBCCDDD"

        char[] MyCharArray = param1.toCharArray(); //"A A A B B B B B C C D D D"
        char MyChar = MyCharArray[0];
        int count = 1;
        for (int i = 1; i < MyCharArray.length; i++) {
            //if that are equal then increase the count
            if (MyChar == MyCharArray[i]){
                count++;
            }
            else{
                // if they are not equal, print the result
                System.out.print(count+Character.toString(MyChar));
                MyChar = MyCharArray[i];
                count=1;
            }

        }
        System.out.print(count+Character.toString(MyChar));

    }
}
