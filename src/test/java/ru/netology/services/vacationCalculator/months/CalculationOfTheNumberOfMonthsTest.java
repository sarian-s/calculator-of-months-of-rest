package ru.netology.services.vacationCalculator.months;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculationOfTheNumberOfMonthsTest {

    @ParameterizedTest
    /*@CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })*/
    @CsvFileSource(files="src/test/resources/month.csv")
    public void calculate(int expected, int income, int expenses, int threshold) {
        CalculationOfTheNumberOfMonthsData service = new CalculationOfTheNumberOfMonthsData();
        //int income = 10000;
        //int expenses = 3000;
        //int threshold = 20000;

        int actual = service.calculate(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}
