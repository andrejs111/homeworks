package io.codelex.oop.Exercise6;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private final float MAX_WEIGHT = 30f;
    private final float MAX_WEIGHT_EXPRESS = 15f;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        int sumOfDimensions = xLength + yLength + zLength;
        if (sumOfDimensions > 300) {
            System.out.println("Sum of dimensions is more than 300.");
            isValid = false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each dimension should be at least 30.");
            isValid = false;
        }
        if (!isExpress && weight > MAX_WEIGHT) {
            System.out.println("The parcel is heavier than allowed weight (30.0).");
            isValid = false;
        } else if (isExpress && weight > MAX_WEIGHT_EXPRESS) {
            System.out.println("The parcel is heavier than allowed weight (15.0).");
            isValid = false;
        }
        return isValid;
    }
}
