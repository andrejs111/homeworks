package io.codelex.oop.Exercise5;

interface CONVERTER {
    double convert(double value);
}

enum ConversionType {
    METERS_TO_YARDS((value) -> value * 1.09361),
    YARDS_TO_METERS((value) -> value * 0.9144),
    CENTIMETERS_TO_INCHES((value) -> value * 0.393701),
    INCHES_TO_CENTIMETERS((value) -> value * 2.54),
    KILOMETERS_TO_MILES((value) -> value * 0.621371),
    MILES_TO_KILOMETERS((value) -> value * 1.60934);

    private CONVERTER converter;

    ConversionType(CONVERTER converter) {
        this.converter = converter;
    }

    public CONVERTER getConverter() {
        return converter;
    }
}

class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}