package day22_MethodOverLoadAndWrapperClass;

public class RecapMethodOverLoad {

    public static void main(String[] args) {

        makeOrder("Double Double Burger");

        line();

        makeOrder("Cheese Burger");

        line();

        makeOrder("Double Double Burger","Strawberry Shake");

        line();

        makeOrder("cheese burger","vanilla shake","french fries");

        line();

        makeOrder("cheese burger","vanilla shake","french fries",2);





    }



    // In-N-Out

    // makeOrder

    private static void makeOrder(String burger){
        System.out.println(burger+ " is ready to Enjoy");
    }

    public static void makeOrder(String burger , String shakes){
        System.out.println(burger+" and "+shakes+ " are ready to Enjoy");
    }


    private static void makeOrder(String burger, String shakes, String fries) {

        System.out.println(burger+" and "+shakes+" and "+fries+" are ready to Enjoy");
    }

    private static void makeOrder(String burger, String shakes, String fries, int numberOfOrder) {

        for (int i=0; i < numberOfOrder; i++){
            System.out.println("Order number: "+(i+1)+". "+burger+" and "+shakes+" and "+fries+" are ready to Enjoy");
            line();
        }
    }


    public static void line(){
        System.out.println("---------------------------------------------");
    }

}
