package homework;

import java.util.Scanner;

public class homework_11 {
    //Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product.
    // Then Calculate the revenue based on giving information (hint: Revenue = quantity x price)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the quantity of the product sold");
        int quantity= scan.nextInt();

        System.out.println("Please enter the price of the items");
        double price= scan.nextDouble();

        System.out.println("Total revenue is: "+ quantity*price);
    }
}
