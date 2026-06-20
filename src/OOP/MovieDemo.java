package OOP;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "Sci-Fi", 2010, 8.8);
        Movie m2 = new Movie("Titanic", "Romance", 1997, 7.9);

        m1.displayInfo();
        m2.displayInfo();

        m2.setRating(8.0);
        m2.displayInfo();

        System.out.println("Total movies created: " + Movie.getTotalMovies());
    }
}