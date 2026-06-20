package OOP;

public class Movie {
    private String title;
    private String genre;
    private int year;
    private double rating;

    private static int totalMovies = 0;

    public Movie() {
        this("Untitled", "Unknown", 2000, 0.0);
    }

    public Movie(String title, String genre, int year, double rating) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        totalMovies++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1800) {
            this.year = year;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 10.0) {
            this.rating = rating;
        }
    }

    public static int getTotalMovies() {
        return totalMovies;
    }

    public void displayInfo() {
        System.out.println(title + " (" + year + ") - " + genre + " - Rating: " + rating);
    }
}