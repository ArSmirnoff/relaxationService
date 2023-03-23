package ru.netology.relaxationService.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class relaxationServiceTest {
    @Test
    public void shouldCalcExact() {
        relaxationService service = new relaxationService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact1() {
        relaxationService service = new relaxationService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);

    }
}