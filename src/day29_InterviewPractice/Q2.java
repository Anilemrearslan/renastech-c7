package day29_InterviewPractice;

public class Q2 {

    //write a method where it takes a poem and return the most Poetical word from the poem

    //calculate score of each world by fallowing scores
    //a,b,c,d,e,f +1
    //x -2
    //k -1

    //Example: Poem => "and the garden diminishes: grape leaves rumpled and rusty, zucchini feeled by borers, tomatoes sparse on the vines"

    //Return => felled

    //question, is there only one space, is there any limitation

    public static void main(String[] args) {
        System.out.println(mostPoeticalWord("and the garden diminishes: grape leaves rumpled and rusty, zucchini feeled by borers, tomatoes sparse on the vines"));
    }

    public static String mostPoeticalWord(String poem){

        String[] Words = poem.split(" ");


        int count2 = 0;
        String wordResult="";
        for (int i = 0; i <Words.length; i++){

            String word = Words[i];// and

            char[] Letters = word.toCharArray();

            int count = 0;

            for (int j = 0; j < Letters.length; j++) {

                if (Letters[j] == 'a' || Letters[j] == 'b' || Letters[j] == 'c' || Letters[j] == 'd' || Letters[j] == 'e' || Letters[j] == 'f'){
                    count=count+1;
                } else if (Letters[j] == 'k') {
                    count=count-1;
                } else if (Letters[j] == 'x') {
                    count=count-2;
                }
            }

            if (count>count2){
                count2=count;
                wordResult = Words[i];
            }

        }

        return wordResult;
    }





}
