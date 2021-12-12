package org.vtbcourse.autoqa.methods;

public class Dropouts {
    public static int numberOfDropouts(int[] players, boolean isGreen, int speed) {
        int dropout = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player > speed || player < -speed) {
                    dropout++;
                }
            }
            return dropout;
        } else {
            return dropout;
        }
    }
}
