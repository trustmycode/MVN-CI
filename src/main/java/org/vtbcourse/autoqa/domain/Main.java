package org.vtbcourse.autoqa.domain;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean isGreenLight = true;
        int[] speedOfPlayers = {0, 3, 5, 0, 0, 1, 0};
        int losers = numberOfDropouts(speedOfPlayers, isGreenLight);
        System.out.println(losers);
        System.out.println(Arrays.toString(speedOfDropouts(speedOfPlayers, isGreenLight)));
        System.out.println(Arrays.toString(speedOfWinners(speedOfPlayers, isGreenLight)));

    }

    public static int numberOfDropouts(int[] players, boolean isGreen) {
        int dropout = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player > 0 || player < 0) {
                    dropout++;
                }
            }
        } else {
            dropout = 0;
        }
        return dropout;
    }

    public static int[] speedOfDropouts(int[] players, boolean isGreen) {
        int n = numberOfDropouts(players, isGreen);
        int[] speedOfLosers = new int[n];
        int i = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player > 0 || player < 0) {
                    speedOfLosers[i] = player;
                    if (i > n) {
                        break;
                    }
                    i++;
                }
            }
        } else System.out.println("Выбывших нет");
        return speedOfLosers;
    }

    public static int[] speedOfWinners(int[] players, boolean isGreen) {
        int n = players.length - numberOfDropouts(players, isGreen);
        int[] speedOfZero = new int[n];
        int i = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player == 0) {
                    speedOfZero[i] = player;
                    if (i > n) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (int j = 0; j < players.length; j++) {
                speedOfZero[j] = players[j];
            }
        }
        return speedOfZero;
    }

}