package com.tifone.demo.payment;

public class SalariedClassification implements PaymentClassification {
    private double itsSalary;
    public SalariedClassification(double salary) {
        itsSalary = salary;
    }
    @Override
    public double getSalary() {
        return itsSalary;
    }
}
