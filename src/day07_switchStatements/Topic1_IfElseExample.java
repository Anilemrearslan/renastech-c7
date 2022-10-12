package day07_switchStatements;

public class Topic1_IfElseExample {

    public static void main(String[] args) {
        //write a code where students are placed in the classes based on individuals preference and knowledge
        // Our school allows student to have only one preference

        String Firstname="Ahmed";
        String Pre="SE";
        int level=3;

        if (Pre == "QA"){
            if (level == 1){
                System.out.println(Firstname+" is placed in Beginner level class for QA");
            }else if (level == 2){
                System.out.println(Firstname+" is placed in Mid level class for QA");
            }else {
                System.out.println(Firstname+" is placed in Advance level class for QA");
            }

        }else if (Pre== "SE"){
            if (level == 1){
                System.out.println(Firstname+" is placed in Beginner level class for SE");
            }else if (level == 2){
                System.out.println(Firstname+" is placed in Mid level class for SE");
            }else {
                System.out.println(Firstname+" is placed in Advance level class for SE");
            }

        }else if (Pre=="DA"){
            if (level==1){
                System.out.println(Firstname+" is placed in Beginner level class for DA");
            }else if (level==2){
                System.out.println(Firstname+" is placed in Mid level class for DA");
            }else{
                System.out.println(Firstname+" is placed in Advance level class for DA");
            }

        }else{
            System.out.println("invalid selection");
            System.out.println("choose QA or SE or DA");
        }
















    }
}
