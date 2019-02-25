package com.tifone.demo.payment;

public class HourlyClassification implements PaymentClassification {
    private double itsSalary;
    public HourlyClassification(double hourlyRate) {
        itsSalary = hourlyRate;
    }
    @Override
    public double getSalary() {
        return itsSalary;
    }
}
