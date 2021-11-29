package org.vtbcourse.autoqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    private int[] arr;
    private boolean isGreen = true;
    private boolean isGreenNeg = false;

    @BeforeEach
    public void setUp() {
        arr = new int[]{1, 2, -3, -4, 0, 0, 2, 3, 0, 3, 0};
    }

    @Test
    public void shouldLeave() {
        int expected = 7;
        int actual = Main.numberOfDropouts(arr, isGreenNeg);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowLosers() {
        int[] expected = {1, 2, -3, -4, 2, 3, 3};
        int[] actual = Main.speedOfDropouts(arr, isGreenNeg);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWinners() {
        int[] expected = {0, 0, 0, 0};
        int[] actual = Main.speedOfWinners(arr, isGreenNeg);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLeaveNoOne() {
        int expected = 0;
        int actual = Main.numberOfDropouts(arr, isGreen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNoOne() {
        int[] expected = {};
        int[] actual = Main.speedOfDropouts(arr, isGreen);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll() {
        int[] expected = {1, 2, -3, -4, 0, 0, 2, 3, 0, 3, 0};
        int[] actual = Main.speedOfWinners(arr, isGreen);
        Assertions.assertArrayEquals(expected, actual);
    }
}
