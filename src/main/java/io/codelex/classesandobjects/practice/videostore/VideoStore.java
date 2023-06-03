package io.codelex.classesandobjects.practice.videostore;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class VideoStore {
    Scanner input = new Scanner(System.in);
    private ArrayList<Video> inventory;

    public VideoStore() {
        this.inventory = new ArrayList<>();
    }

    public void addVideo() {
        System.out.println("Enter movie name: ");
        String videoName = input.next();
        System.out.println("Assign store rating: ");
        int videoRating = input.nextInt();
        System.out.println("Is the movie checked out? (true/false) ");
        boolean videoChecked = input.nextBoolean();

        Video newVideo = new Video(videoName, videoRating, videoChecked);
        inventory.add(newVideo);
    }

    public void checkVideo() {
        System.out.println("What movie would you like to check out? ");
        String name = input.next();
        for (Video video : inventory) {
            if (name.equals(video.getName())) {
                if (video.isChecked()) {
                    System.out.println("Movie not available.");
                } else {
                    System.out.println("Movie checked out successfully.");
                    video.checked = true;
                }
                return;
            }
        }
        System.out.println("Movie not found in inventory.");
    }

    public void returnVideo() {
        System.out.println("What movie would you like to return? ");
        String name = input.next();
        for (Video video : inventory) {
            if (Objects.equals(name, String.valueOf(video.getName()))) {
                if (video.isChecked()) {
                    System.out.println("Movie returned successfully.");
                    video.checked = false;
                }
                return;
            }
        }
    }

    public void listStore() {
        System.out.println(inventory.toString());
    }

    public void fillStore(VideoStore videoStore) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter movie name:");
        String videoName = input.nextLine().trim();
        System.out.print("Assign store rating:");
        int videoRating = input.nextInt();
        System.out.println("Is the movie checked out? (true/false) ");
        boolean videoChecked = input.nextBoolean();

        Video newVideo = new Video(videoName, videoRating, videoChecked);
        inventory.add(newVideo);

        System.out.println("1. Press 1 to add another movie.\n2. Press 2 to exit.");
        int decision = input.nextInt();
        switch (decision) {
            case 1 -> fillStore(videoStore);
            case 2 -> System.exit(0);
        }
    }
    public void addRating() {
        System.out.println("Enter the movie name to add a rating: ");
        String name = input.next();
        for (Video video : inventory) {
            if (Objects.equals(name, String.valueOf(video.getName()))) {
                System.out.println("Enter the rating for the movie (1-10): ");
                int rating = input.nextInt();
                video.addRating(rating);
                System.out.println("Rating added successfully.");
                return;
            }
        }
        System.out.println("Movie not found in inventory.");
    }
    @Override
    public String toString() {
        return "VideoStore{" +
                "inventory=" + inventory +
                '}';
    }
}