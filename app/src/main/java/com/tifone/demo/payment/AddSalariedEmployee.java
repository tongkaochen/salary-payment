package com.tifone.demo.payment;

public class AddSalariedEmployee extends AddEmployeeTransaction{
    private double itsSalary;
    public AddSalariedEmployee(int empId, String name, String addr, double salary) {
        super(empId, name, addr);
        itsSalary = salary;
    }

    @Override
    public PaymentClassification getClassification() {
        return new SalariedClassification(itsSalary);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new MonthlySchedule();
    }

    @Override
    public PaymentMethod getMethod() {
        return new HoldMethod();
    }

}
