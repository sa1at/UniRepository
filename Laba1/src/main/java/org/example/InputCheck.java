package org.example;

import java.util.Scanner;

public class InputCheck {

    public static String inputWithLetter(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine();

            if (!input.matches("[a-zA-Z]+")) {
                System.out.println("Некорректный ввод. Введите только буквы.");
            }
        } while (!input.matches("[a-zA-Z]+"));

        return input;
    }

    public static int inputWithNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите только целое число.");
                scanner.next(); // Сбросить некорректный ввод
            }
            input = scanner.nextInt();
        } while (input < 0);

        return input;
    }

    public static double inputWithDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Некорректный ввод. Введите только число с плавающей точкой.");
                scanner.next(); // Сбросить некорректный ввод
            }
            input = scanner.nextDouble();
        } while (input <= 0);

        return input;
    }

}
