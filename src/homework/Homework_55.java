package homework;

import CustomClassesForHomework.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_55 {
    /*
    Use "Movie" Class to create objects. (You created this in Homework 54.)
    Create 5 Movie instances (Objects)
    Write a Method where it takes List of all the movies and returns to List of Movies those are "Action" types.
    tip: Arraylist of movie.
     */
    public static void main(String[] args) {
        Movie MyMovie1 = new Movie("TransFormers" , "Action",5.7,"Optimus Prime");
        Movie MyMovie2 = new Movie("Top Gun:Maverick", "Action",8.8,"Tom Cruise");
        Movie MyMovie3 = new Movie("Prey", "Horror",6.0, "terrifying things");
        Movie MyMovie4 = new Movie("The Green Mile","Drama",9.8, "Tom Hanks");

        ArrayList<Movie> MovieList = new ArrayList<>();
        MovieList.addAll(Arrays.asList(MyMovie1,MyMovie2,MyMovie3,MyMovie4));

        ArrayList<Movie>ActionMovies=ActionMovies(MovieList);

        for (Movie Movie:ActionMovies){
            Movie.getMovie();
            System.out.println("**************");
        }


    }

    public static ArrayList<Movie> ActionMovies(ArrayList<Movie> param1){
        ArrayList<Movie> ActionMovies = new ArrayList<>();
        for (Movie Action:param1) {

            if (Action.Type.equalsIgnoreCase("Action")){
                ActionMovies.add(Action);
            }
        }
        return ActionMovies;
    }
}
