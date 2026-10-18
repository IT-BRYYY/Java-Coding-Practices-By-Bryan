package OOP;

import java.util.Arrays;

abstract class RatedMedia
        implements Comparable<RatedMedia> {

    private String title;

    RatedMedia(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getRating();

    @Override
    public int compareTo(RatedMedia other) {
        return Double.compare(
                this.getRating(),
                other.getRating()
        );
    }
}

class MovieRecord extends RatedMedia {
    private double rating;

    MovieRecord(String title, double rating) {
        super(title);
        this.rating = rating;
    }

    @Override
    public double getRating() {
        return rating;
    }
}

public class MediaRatingDemo {
    public static void main(String[] args) {
        RatedMedia[] movies = {
                new MovieRecord("Movie A", 8.2),
                new MovieRecord("Movie B", 6.8),
                new MovieRecord("Movie C", 9.1)
        };

        Arrays.sort(movies);

        System.out.println("Movies sorted by rating:");

        for (RatedMedia movie : movies) {
            System.out.printf(
                    "%s - %.1f%n",
                    movie.getTitle(),
                    movie.getRating()
            );
        }
    }
}