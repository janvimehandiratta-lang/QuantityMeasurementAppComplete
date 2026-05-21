package com.app.quantitymeasurement.enumImpl;
import com.app.quantitymeasurement.dto.QuantityDTO;
import com.app.quantitymeasurement.enums.IMeasurable;

public enum WeightUnit implements IMeasurable {

    KILOGRAM(1.0),
    GRAM(0.001),
    POUND(1.0 / 2.20462);

    private final double toKilogramFactor;

    WeightUnit(double toKilogramFactor) {
        this.toKilogramFactor = toKilogramFactor;
    }

    @Override
    public double getConversionFactor() {
        return toKilogramFactor;
    }

    @Override
    public double convertToBaseUnit(double value) {
        validate(value);
        return value * toKilogramFactor;
    }

    @Override
    public double convertFromBaseUnit(double value) {
        validate(value);
        return value / toKilogramFactor;
    }

    private void validate(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
    }
}