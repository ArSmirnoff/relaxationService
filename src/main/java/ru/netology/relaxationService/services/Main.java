package ru.netology.relaxationService.services;

public class Main {
    public static void main(String[] args) {
        relaxationService service = new relaxationService();
        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }
}