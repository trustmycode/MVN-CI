package org.vtbcourse.autoqa.domain;

import java.util.Arrays;

import static org.vtbcourse.autoqa.methods.Dropouts.numberOfDropouts;
import static org.vtbcourse.autoqa.methods.SpeedDisplay.speedOfDropouts;
import static org.vtbcourse.autoqa.methods.SpeedDisplay.speedOfWinners;
import static org.vtbcourse.autoqa.methods.Survivors.survivorsNames;

class Main {
    public static void main(String[] args) {
        int maxSpeed = 5;
        boolean isGreenLight = false;
        int[] speedOfPlayers = {0, 3, 6, 0, 4, -8, 1};
        int losers = numberOfDropouts(speedOfPlayers, isGreenLight, maxSpeed);
        System.out.println(losers);
        System.out.println(Arrays.toString(speedOfDropouts(speedOfPlayers, isGreenLight, maxSpeed)));
        System.out.println(Arrays.toString(speedOfWinners(speedOfPlayers, isGreenLight, maxSpeed)));
        String[] nameSpeed = {"Jhon 5",
                "Bill 7",
                "Jhoseph 10",
                "Emma -4",
                "Viktor 0" };
        System.out.println(Arrays.toString(survivorsNames(nameSpeed, maxSpeed)));
    }








}