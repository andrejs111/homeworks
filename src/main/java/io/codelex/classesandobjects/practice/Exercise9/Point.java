package io.codelex.classesandobjects.practice.Exercise9;

public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void swapPoints(Point point2) {
        int placeholderX = this.x;                                // temporary variables to store values in this method
        int placeholderY = this.y;

        this.x = point2.x;
        this.y = point2.y;

        point2.x = placeholderX;
        point2.y = placeholderY;
    }

}
