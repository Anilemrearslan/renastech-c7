package homework;

import CustomClassesForHomework.Shoes;

import java.util.ArrayList;

public class homework_49 {
    /*
    Write a Class and Name it Shoes that has following attributes
1) Brand
2) Size
3) Type
4) Price
Also has the following Methods
1) SetInfo(): Where it Takes String brand, double size, String Type and double price to Set the attributes
2) Print(): Where it prints the value of attributes.

Create 4 different Object (Class Instance) of Shoes Class. and add it to array-list.
Print all the Shoe instances that has price over 10,
Apply discount for those 15% off on the ones that has Price of 50 or over
     */

    public static void main(String[] args) {

        ArrayList<Shoes> shoesList = new ArrayList<>();

        Shoes shoes1 = new Shoes();
        shoes1.setInfo("Nike",11);
        shoesList.add(shoes1);

        Shoes shoes2 = new Shoes();
        shoes2.setInfo("kinetix",60);
        shoesList.add(shoes2);

        Shoes shoes3 = new Shoes();
        shoes3.setInfo("Adidas",55);
        shoesList.add(shoes3);

        Shoes shoes4 = new Shoes();
        shoes4.setInfo("Puma",75);
        shoesList.add(shoes4);

        for (int i = 0; i < shoesList.size(); i++) {

            if (shoesList.get(i).Price > 10.0){
                System.out.println("Shoes that are more expensive than 10 dollars : "+ shoesList.get(i).Brand);

                if (shoesList.get(i).Price > 50.0){
                    System.out.println("Shoes that are more expensive than 50 dollars : "+ shoesList.get(i).Brand);
                    shoesList.get(i).Price-= shoesList.get(i).Price * 15/100;

                    System.out.println(shoesList.get(i).Brand + " 's  new price is " + shoesList.get(i).Price+ " after 15% discount");
                }
            }


        }
    }
}
