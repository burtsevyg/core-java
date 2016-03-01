package ru.burtsevyg.chapter03;

/**
 * Created by yuriy on 17.02.16.
 */
public class MathClass {
    public static void main(String[] args) {
        double number = 4;
        System.out.println("Число " + number);
        double sqrt = Math.sqrt(number);
        System.out.println("Корень числа " + sqrt);

        System.out.println("Число пи из класса StrictMath равно " + StrictMath.PI);
        System.out.println(StrictMath.PI);
        System.out.println("Число пи из класса Math равно " + Math.PI);
        System.out.println(Math.PI);
    }
}
