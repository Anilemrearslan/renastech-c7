package homework;

import CustomClassesForHomework.Movie;

import java.util.Scanner;

public class Homework_54 {
    /*
    Create "Movie" Class Where it has following fields
    1) String Name
    2) String Type
    3) double Rating
    4) String Star
    Write a code where It ask user to enter Name, Type, Rating and Star and create new object with these values.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter name of the movie");
        String Name = scan.nextLine();
        System.out.println("please enter type of the movie");
        String Type = scan.nextLine();
        System.out.println("please enter Rating of the movie");
        double Rating = scan.nextDouble();scan.nextLine();
        System.out.println("Please enter name of the Star");
        String StarName = scan.nextLine();

        Movie MyMovie = new Movie(Name,Type,Rating,StarName);
        MyMovie.FavouriteMovie();
    }
}

