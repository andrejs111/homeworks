package io.codelex.classesandobjects.practice.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public static List<Movie> getPG(Movie[] movies) {
        List<Movie> pgMovies = new ArrayList<>();                   // we don't know, how many movies with PG there are, so using List
            for(Movie movie : movies) {                             // for (DataType variable : array)
                if(movie.rating.toUpperCase().equals("PG")) {
                    pgMovies.add(movie);
                }
            }
            return pgMovies;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
