package day19_MultiDimensionArrays;

public class Topic8_ForEachLoopEx {

    public static void main(String[] args) {
        //write a code where user check every String values in array and see if that String has "a" in it:


        String [] str= {"Alibaba","omur","Gorkem","Nasrettin","Hoca"};

        for (String var:str){
            if (var.contains("a")||var.contains("A")){
                System.out.println("the word: "+var+" contains a or A");
            }else {
                System.out.println("the word: "+var+" does NOT contains a or A");
            }
        }






    }
}
