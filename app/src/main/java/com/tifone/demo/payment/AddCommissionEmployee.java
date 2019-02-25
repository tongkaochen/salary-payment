package com.tifone.demo.payment;

public class AddCommissionEmployee extends AddEmployeeTransaction {

    private double itsSalary;
    private double itsCommissioned;
    public AddCommissionEmployee(int empid, String name, String addr,
                                 double salary, double commissioned) {
        super(empid, name, addr);
        itsSalary = salary;
        itsCommissioned = commissioned;
    }

    @Override
    public PaymentClassification getClassification() {
        return new CommissionClassification(itsSalary, itsCommissioned);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new BiweeklySchedule();
    }

    @Override
    public PaymentMethod getMethod() {
        return new HoldMethod();
    }
}
