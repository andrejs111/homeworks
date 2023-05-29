package io.codelex.oop.Exercise5;

public class ConversionTest {
    public static void main(String[] args) {
        int value = 1000;
        double result = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(result);
        double result2 = MeasurementConverter.convert(value, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(result2);
        double result3 = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(result3);
    }
}
