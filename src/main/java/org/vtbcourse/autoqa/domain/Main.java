package org.vtbcourse.autoqa.domain;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int maxSpeed = 5;
        boolean isGreenLight = false;
        int[] speedOfPlayers = {0, 3, 6, 0, 4, -8, 1};
        int losers = numberOfDropouts(speedOfPlayers, isGreenLight, maxSpeed);
        System.out.println(losers);
        System.out.println(Arrays.toString(speedOfDropouts(speedOfPlayers, isGreenLight, maxSpeed)));
        System.out.println(Arrays.toString(speedOfWinners(speedOfPlayers, isGreenLight, maxSpeed)));

    }

    public static int numberOfDropouts(int[] players, boolean isGreen, int speed) {
        int dropout = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player > speed || player < -speed) {
                    dropout++;
                }
            }
        } else {
            dropout = 0;
        }
        return dropout;
    }

    public static int[] speedOfDropouts(int[] players, boolean isGreen, int speed) {
        int n = numberOfDropouts(players, isGreen, speed);
        int[] speedOfLosers = new int[n];
        int i = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player > speed || player < -speed) {
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

    public static int[] speedOfWinners(int[] players, boolean isGreen, int speed) {
        int n = players.length - numberOfDropouts(players, isGreen, speed);
        int[] speedOfZero = new int[n];
        int i = 0;
        if (!isGreen) {
            for (int player : players) {
                if (player >= -speed && player <= speed) {
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