package day35_InterviewPracticeNumbers;

public class loops {

    public static void main(String[] args) {
        String[] Countries = {"Portugal", "Switzerland", "Spain", "Morocco"};
        System.out.println("***UsingFor***");
        UsingFor(Countries);

        System.out.println("***UsingForEach***");
        UsingForEach(Countries);

        System.out.println("***UsingWhile***");
        UsingWhile(Countries);
    }

    public static void UsingFor(String[] param1){
        for (int i = 0; i < param1.length; i++) {
            System.out.println(param1[i]);
        }
    }

    public static void UsingForEach(String[] param1){
        for(String Each :param1){
            System.out.println(Each);
        }
    }

    public static void UsingWhile(String[] param1){
        int i = 0;
        while(i< param1.length){
            System.out.println(param1[i]);
            i++;
        }
    }



}
