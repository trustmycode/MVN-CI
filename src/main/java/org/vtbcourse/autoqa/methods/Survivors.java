package org.vtbcourse.autoqa.methods;

public class Survivors {
    public static String[] survivorsNames(String[] nameSpeed, int maxSpeed) {
        StringBuilder nameString = new StringBuilder();
        for (String nameSplit : nameSpeed) {
            String[] parts = nameSplit.split(" ");
            String name = parts[0];
            int speed = Integer.parseInt(parts[1]);
            if (speed <= maxSpeed && speed >= -maxSpeed) {
                nameString.append(name).append(" ");
            }
        }
        return nameString.toString().split(" ");
    }
}
