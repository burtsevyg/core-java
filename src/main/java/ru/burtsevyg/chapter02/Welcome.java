package ru.burtsevyg.chapter02;

class Welcome {
    public static void main(String[] args) {
        String[] greetings = new String[3];

        greetings[0] = "Здравствуйте!";
        greetings[1] = "Меня зовут";
        greetings[2] = "Юрий";

        for (String subString : greetings) {
            System.out.println(subString);
        }
    }
}
