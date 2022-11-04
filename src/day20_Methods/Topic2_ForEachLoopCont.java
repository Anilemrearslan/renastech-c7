package day20_Methods;

public class Topic2_ForEachLoopCont {

    public static void main(String[] args) {
        //write a code where you are given of array of String as shown below to check how many characters 'c' or 'C'
        //is in each value:

        String [] animals={"Cow", "Fish","Horse","Lion","Crocodile","Eagle"};

        for (String var:animals){
            System.out.println("the value of var variable: "+var);
            int count=0;
           char[] letters = var.toCharArray();

           for (char c:letters){
               if (c=='c'||c=='C'){
                   count++;

               }
           }
            System.out.println("the animal "+var+ " has "+count+" char c in the name");
            System.out.println("****************************");
        }








    }
}
