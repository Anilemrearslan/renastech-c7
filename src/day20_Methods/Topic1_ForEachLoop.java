package day20_Methods;

public class Topic1_ForEachLoop {

    public static void main(String[] args) {

        //Write a code where user is given an array of Strings that contains given animal's names
        // find which one of those animals has '0' in the name

        String [] Animals = {"cat","Dog","Monkey","Rabbit"};

        for (String animal:Animals){

            System.out.println("The current animal variable value "+animal);
            if (animal.contains("o")||animal.contains("O")){
                System.out.println("Animal "+animal+" has letter o or O in their name ");
            }else {
                System.out.println("Animal "+animal+" does not have letter o od O in their name ");
            }
            System.out.println("*********************");
        }






    }
}
