package io.codelex.polymorphism.practice.exercise5;

import java.text.DecimalFormat;

public class Poster extends Advert {

    protected double posterLength;
    protected double posterWidth;
    protected final double MATERIAL_COST = 0.3;
    protected int copies;

    public Poster (int fee, double posterLength, double posterWidth, int copies) {
        super(fee);
        this.posterLength = posterLength;
        this.posterWidth = posterWidth;
        this.copies = copies;
    }
    public double getSize() {
        return this.posterLength * this.posterWidth;
    }
    public int cost() {
        return super.cost() + (int) (posterLength * posterWidth * MATERIAL_COST * copies);
    }

    public double getPosterLength() {
        return posterLength;
    }

    public void setPosterLength(double posterLength) {
        this.posterLength = posterLength;
    }

    public double getPosterWidth() {
        return posterWidth;
    }

    public void setPosterWidth(double posterWidth) {
        this.posterWidth = posterWidth;
    }

    public double getMATERIAL_COST() {
        return MATERIAL_COST;
    }
    public String formatDimensions() {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String formattedWidth = decimalFormat.format(posterLength);
        String formattedHeight = decimalFormat.format(posterWidth);
        return formattedWidth + "x" + formattedHeight;
    }

    public String toString() {
        return super.toString() + " Poster: Size=" + formatDimensions() + " Copies=" + copies + " Price=" + cost();
    }
}
