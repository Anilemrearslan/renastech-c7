package day33_StringBuilderAndFileOperations;

public class Topic2_StringBuilderCont {
    public static void main(String[] args) {
        //String is immutable
        String word = "Henry";
        String newWord = word.replace("e","a");
        System.out.println(newWord);

        System.out.println("***************************");

        //StringBuilder is mutable
        StringBuilder SB = new StringBuilder();
        SB.append("Henry");
        SB.replace(1,2,"a");
        System.out.println(SB);
    }
}
