package org.vtbcourse.autoqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    private int[] arr;
    private boolean isGreen = true;
    private boolean isGreenNeg = false;
    private int maxSpeed;

    @BeforeEach
    public void setUp() {
        arr = new int[]{1, 2, -3, -4, 0, 0, 5, 3, 0, 3, 0};
        maxSpeed = 3;
    }

    @Test
    public void shouldLeave() {
        int expected = 2;
        int actual = Main.numberOfDropouts(arr, isGreenNeg, maxSpeed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowLosers() {
        int[] expected = {-4, 5};
        int[] actual = Main.speedOfDropouts(arr, isGreenNeg, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWinners() {
        int[] expected = {1, 2, -3, 0, 0, 3, 0, 3, 0};
        int[] actual = Main.speedOfWinners(arr, isGreenNeg, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLeaveNoOne() {
        int expected = 0;
        int actual = Main.numberOfDropouts(arr, isGreen, maxSpeed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNoOne() {
        int[] expected = {};
        int[] actual = Main.speedOfDropouts(arr, isGreen, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll() {
        int[] expected = arr;
        int[] actual = Main.speedOfWinners(arr, isGreen, maxSpeed);
        Assertions.assertArrayEquals(expected, actual);
    }
}