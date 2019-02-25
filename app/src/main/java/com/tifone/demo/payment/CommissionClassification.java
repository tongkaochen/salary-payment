package com.tifone.demo.payment;

class CommissionClassification implements PaymentClassification {
    private double itsSalary;
    private double itsCommissioned;
    public CommissionClassification(double salary, double commissioned) {
        itsSalary = salary;
        itsCommissioned = commissioned;
    }

    @Override
    public double getSalary() {
        return itsSalary + itsCommissioned;
    }
}
