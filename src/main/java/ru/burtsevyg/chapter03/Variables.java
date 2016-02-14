package ru.burtsevyg.chapter03;

/**
 * Created by yuriy on 14.02.16.
 */
public class Variables {
    public static void main(String[] args) {
        int простоеЧисло = 13;
        простоеЧисло = простоеЧисло * 5;
        System.out.println("простоеЧисло = " + простоеЧисло);
        System.out.println("Переменная может начинаться с &: " + Character.isJavaIdentifierStart('&'));
        System.out.println("Переменная может начинаться с %: " + Character.isJavaIdentifierStart('%'));
        // используется компилятором, не рекомендуется использовать:
        System.out.println("Переменная может начинаться с $: " + Character.isJavaIdentifierStart('$'));
        System.out.println("Переменная может начинаться с 3: " + Character.isJavaIdentifierStart('3'));
        System.out.println("Переменная может начинаться с :: " + Character.isJavaIdentifierStart(':'));
    }
}
