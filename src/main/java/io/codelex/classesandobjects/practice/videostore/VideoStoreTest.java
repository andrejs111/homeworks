package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();

        while (true) {
            System.out.println("Welcome!\nWhat would you like to do? ");
            System.out.println("Press 1 to fill up the store.");
            System.out.println("Press 2 to add a new video.");
            System.out.println("Press 3 to add a new rating.");
            System.out.println("Press 4 to check out video.");
            System.out.println("Press 5 to return a video.");
            System.out.println("Press 6 to list the inventory.");
            System.out.println("Press 7 to exit.");

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            switch (option) {
                case 1 -> videoStore.fillStore(videoStore);
                case 2 -> videoStore.addVideo();
                case 3 -> videoStore.addRating();
                case 4 -> videoStore.checkVideo();
                case 5 -> videoStore.returnVideo();
                case 6 -> videoStore.listStore();
                case 7 -> System.exit(0);
            }
        }
    }
}