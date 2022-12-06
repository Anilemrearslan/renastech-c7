package day34_IntervievPracticeString;

public class Topic1_ReverseString {

    public static void main(String[] args) {
        System.out.println(UsingStringBuilder("This is an example"));
        System.out.println("**********************************************");
        System.out.println(RegularWay("This is an example"));
        System.out.println("**********************************************");
        System.out.println(RegularWayWithForEach("This is an example"));
    }

    public static String UsingStringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }

    public static String RegularWay(String param1){
        char[] MyCharArray = param1.toCharArray();
        String reverseString= "";
        for (int i = 0; i <MyCharArray.length ; i++) {
            reverseString = MyCharArray[i] + reverseString;
        }

        return reverseString;
    }

    public static String RegularWayWithForEach(String param1){
        char[] MyCharArray = param1.toCharArray();
        String ReversedString = "";

        for (char MyChar:MyCharArray){
            ReversedString = MyChar + ReversedString;
        }

        return ReversedString;
    }
}
