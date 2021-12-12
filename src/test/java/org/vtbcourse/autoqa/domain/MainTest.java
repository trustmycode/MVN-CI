package org.vtbcourse.autoqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.vtbcourse.autoqa.methods.Dropouts.numberOfDropouts;
import static org.vtbcourse.autoqa.methods.SpeedDisplay.speedOfDropouts;
import static org.vtbcourse.autoqa.methods.SpeedDisplay.speedOfWinners;
import static org.vtbcourse.autoqa.methods.Survivors.survivorsNames;

public class MainTest {
    private int[] arr;
    private boolean isGreen = true;
    private boolean isGreenNeg = false;
    private int maxSpeed;
    private String[] survString;

    @BeforeEach
    public void setUp() {
        arr = new int[]{1, 2, -3, -4, 0, 0, 5, 3, 0, 3, 0};
        maxSpeed = 3;
        survString = new String[]{"Jhon 4", "Mike 3", "Elle -2", "Olga 0", "Steven -3", "Tom 2", "Mark -4"};
    }

    @Test
    public void shouldLeave() {
        int expected = 2;
        int actual = numberOfDropouts(arr, isGreenNeg, maxSpeed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowLosers() {
        int[] expected = {-4, 5};
        int[] actual = speedOfDropouts(arr, isGreenNeg, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWinners() {
        int[] expected = {1, 2, -3, 0, 0, 3, 0, 3, 0};
        int[] actual = speedOfWinners(arr, isGreenNeg, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLeaveNoOne() {
        int expected = 0;
        int actual = numberOfDropouts(arr, isGreen, maxSpeed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNoOne() {
        int[] expected = {};
        int[] actual = speedOfDropouts(arr, isGreen, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll() {
        int[] expected = arr;
        int[] actual = speedOfWinners(arr, isGreen, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowSurvivors() {
        String[] expected = {"Mike", "Elle", "Olga", "Steven", "Tom"};
        String[] actual = survivorsNames(survString, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }
}