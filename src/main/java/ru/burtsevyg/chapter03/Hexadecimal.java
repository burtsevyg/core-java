package ru.burtsevyg.chapter03;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Callable;

/**
 * Created by yuriy on 10.02.16.
 */
public class Hexadecimal {
    public void main(String[] args) {
        // обозначает 1.0 * 2^(-3)
        double number = 0x1.0p-3;
        System.out.println("0x1.0p-3 = " + number);

        double number2 = 0x1.0p-3;
        System.out.println("0x1.0p-3 = " + number2);

    }
}
