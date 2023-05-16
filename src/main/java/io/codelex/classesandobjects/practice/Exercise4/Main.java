package io.codelex.classesandobjects.practice.Exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie film1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie film2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie film3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
        Movie[] films = new Movie[]{film1, film2, film3};
        // System.out.println(films[1]);
        List<Movie> pgFilms = Movie.getPG(films);        // we can call getPG method directly on Movie class because it is static

        for (Movie film : pgFilms) {                     // element film of pgFilms list of Movie objects
            System.out.println(film);
        }
    }
}
