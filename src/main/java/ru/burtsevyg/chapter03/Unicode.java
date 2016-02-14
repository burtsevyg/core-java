package ru.burtsevyg.chapter03;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by yuriy on 14.02.16.
 */
public class Unicode {
    public static void main(String[] args) {
        System.out.println(Integer.toHexString('Ё') + " = " + "Ё");

        for (int i = 1040; i < 1104; i++) {
            String uSymbol = Integer.toHexString(i);
            System.out.println(uSymbol + " = " + (char) i);
        }

        System.out.println(Integer.toHexString('ё') + " = " + "ё");
    }
}
