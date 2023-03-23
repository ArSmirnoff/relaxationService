package ru.netology.relaxationService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class relaxationServiceTest {
    @ParameterizedTest
   @CsvFileSource(files ="src/test/resources/relaxation.csv")

    public void shouldCalcExact(int expected, int income, int expenses, int threshold) {
        relaxationService service = new relaxationService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


}