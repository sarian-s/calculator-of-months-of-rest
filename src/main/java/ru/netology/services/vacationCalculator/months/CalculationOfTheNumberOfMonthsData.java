package ru.netology.services.vacationCalculator.months;
public class CalculationOfTheNumberOfMonthsData {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // отдыхаем если
                count++; // увеличиваем счётчик месяцев отдыха на 1
                money = money - expenses; //вычитаем обязательные траты из количества денег
                money = money - (money * 2) /3; //вычитаем траты на отдых
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
