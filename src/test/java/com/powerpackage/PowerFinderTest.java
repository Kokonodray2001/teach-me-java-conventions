package com.powerpackage;

import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneShouldBeOneTest() {
        assert PowerFinder.calculatePower(1, 1) == 1;
    }

    @Test
    public void twoRaisedToOneShouldBeTwoTest() {
        assert PowerFinder.calculatePower(2, 1) == 2;
    }

    @Test
    public void twoRaisedToTwoShouldBeFourTest() {
        assert PowerFinder.calculatePower(2, 2) == 4;
    }

    @Test
    public void twoRaisedToThreeShouldBeEightTest() {
        assert PowerFinder.calculatePower(2, 3) == 8;
    }
}
