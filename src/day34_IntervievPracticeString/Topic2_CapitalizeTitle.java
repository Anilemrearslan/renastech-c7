package day34_IntervievPracticeString;

import javafx.concurrent.Worker;

public class Topic2_CapitalizeTitle {
    public static void main(String[] args) {
        //jaVa iS eASy ===> Java Is Easy

        System.out.println(UsingSplit("jaVa iS eASy"));
    }


    public static String UsingSplit(String param1){
        String CapitalizedString = "";
        String[] MyWords = param1.split(" ");

        for(String word:MyWords){
            // word = MyWords[i];
            //jaVa iS eASy
            String FirstChar = word.substring(0,1);
            String RemainingChars = word.substring(1);

            FirstChar = FirstChar.toUpperCase();
            RemainingChars=RemainingChars.toLowerCase();

            CapitalizedString = CapitalizedString + FirstChar + RemainingChars +" ";
        }

        CapitalizedString=CapitalizedString.trim();

        return CapitalizedString;
    }




}
