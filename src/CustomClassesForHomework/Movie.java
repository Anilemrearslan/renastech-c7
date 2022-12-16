package CustomClassesForHomework;

public class Movie {
    public String Name;
    public String Type;
    public double Rating;
    public String Star;

    public Movie(String Name, String Type, Double Rating, String Star) {
        this.Name = Name;
        this.Type = Type;
        this.Rating = Rating;
        this.Star = Star;
    }

    public void FavouriteMovie() {

        System.out.println("Name of thi Movie: " + Name);
        System.out.println("Type of the movie: " + Type);
        System.out.println("Movie Rating: " + Rating);
        System.out.println("Movie Star " + Star);
    }

    public void getMovie() {

        System.out.println("Name of thi Movie: " + Name);
        System.out.println("Type of the movie: " + Type);
        System.out.println("Movie Rating: " + Rating);
        System.out.println("Movie Star " + Star);
    }
}
