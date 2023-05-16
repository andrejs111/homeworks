package io.codelex.classesandobjects.practice.VideostoreExercise11;

public class Video {
    String title;
    Boolean checked;
    int rating;

    public Video(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public boolean checkOutVideo() {
        return this.checked = true;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
