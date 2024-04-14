package com.powerpackage;

public class PowerFinder {
    public static long calculatePower(int baseValue, int ExponentValue) {
        long resultValue = 1;
        for (int i = 0; i < ExponentValue; i++) {
            resultValue *= baseValue;
        }
        return resultValue;
    }
}
