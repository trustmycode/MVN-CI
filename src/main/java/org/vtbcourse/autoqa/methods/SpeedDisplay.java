package org.vtbcourse.autoqa.methods;

import static org.vtbcourse.autoqa.methods.Dropouts.numberOfDropouts;

public class SpeedDisplay {
    public static int[] speedOfDropouts(int[] players, boolean isGreen, int speed) {
        int n = numberOfDropouts(players, isGreen, speed);
        int[] speedOfLosers = new int[n];
        int i = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player > speed || player < -speed) {
                    speedOfLosers[i] = player;
                    i++;
                }
            }
        } else System.out.println("Выбывших нет");
        return speedOfLosers;
    }
    public static int[] speedOfWinners(int[] players, boolean isGreen, int speed) {
        int n = players.length - numberOfDropouts(players, isGreen, speed);
        int[] speedOfZero = new int[n];
        int i = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player >= -speed && player <= speed) {
                    speedOfZero[i] = player;
                    i++;
                }
            }
            return speedOfZero;
        } else {
            return players;
        }
    }
}
