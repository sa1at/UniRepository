package org.example;

public class Main {
    public static void main(String[] args) {
        double cost = InputCheck.inputWithDouble("Введите цену тарифа: ");
        String name = InputCheck.inputWithLetter("Введите название оператора: ");
        int numOfSub = InputCheck.inputWithNumber("Введите количество абонентов: ");

        InternetOperator operator = new InternetOperator(cost, name, numOfSub);
        double totalRevenue = operator.calculate();
        System.out.println("Общая выручка: " + totalRevenue);
    }
}