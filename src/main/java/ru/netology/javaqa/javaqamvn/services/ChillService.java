package ru.netology.javaqa.javaqamvn.services;

public class ChillService {
    public int calculate(int income, int expenses,int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;// количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {// можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха"Придется работать." "Придется работать."
                money = (money - expenses) / 3;
               System.out.println("Месяц " + month + "." + "Денег " + money + "." + "Буду отдыхать." + "Заработал " + "+" + income + "," + "потратил " + "-" + expenses );
            } else {
                money = money + income - expenses;
                System.out.println("Месяц " + month + "." + "Денег " + money + "." + "Придется работать." + "Заработал " + "+" + income + "," + "потратил " + "-" + expenses );
            }
        }
        return count;
    }
}
