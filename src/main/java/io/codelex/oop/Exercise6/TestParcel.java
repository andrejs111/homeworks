package io.codelex.oop.Exercise6;

public class TestParcel {
    public static void main(String[] args) {
        Parcel newParcel = new Parcel(30, 45, 50, 15.1f, true);
        System.out.println("Test case 1: ");
        newParcel.validate();
        Parcel anotherParcel = new Parcel(100, 50, 151, 29.1f, false);
        System.out.println("Test case 2: ");
        anotherParcel.validate();
        Parcel thirdParcel = new Parcel(150, 100, 100, 16.1f, true);
        System.out.println("Test case 3: ");
        thirdParcel.validate();
    }
}
