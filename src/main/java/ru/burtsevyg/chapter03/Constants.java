package ru.burtsevyg.chapter03;

/**
 * Created by yuriy on 14.02.16.
 */
public class Constants {
    public static void main(String[] args) {
        final int SPEED_OF_LIGHT_IN_VACUUM = 299_792_458; // m/s
        final int MINUTE = 60; // s
        final int HOUR = 60 * MINUTE; // s
        final int DAY = 24 * HOUR; // s
        final int YEAR = 365 * DAY; // s
        final long LIGHT_YEAR = (long)SPEED_OF_LIGHT_IN_VACUUM * YEAR;

        System.out.println("Скорость света " + SPEED_OF_LIGHT_IN_VACUUM + " м/c.");
        System.out.println("В минуте " + MINUTE + " секунд.");
        System.out.println("В часе " + HOUR + " секунд.");
        System.out.println("В сутках " + DAY + " секунд.");
        System.out.println("В году " + YEAR + " секунд.");
        System.out.println("За год свет пролетает " + LIGHT_YEAR + " метров.");

    }
}
