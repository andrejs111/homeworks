package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Video {
    private String name;
    private List<Integer> ratings;
    boolean checked;

    public Video(String name, int rating, boolean checked) {
        this.name = name;
        this.ratings = new ArrayList<>();
        this.checked = checked;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public String getName() {
        return name;
    }
    public void addRating(int rating) {
        ratings.add(rating);
    }


    public void getAverageRating() {
        if (ratings.isEmpty()) {
            System.out.println("0.0");
        } else {
            int sum = 0;
            for (int rating : ratings) {
                sum += rating;
            }
            double avgRating = (double) sum / ratings.size();
            System.out.println(avgRating);
        }

}
    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", ratings=" + ratings +
                ", checked=" + checked +
                '}';
    }
}
