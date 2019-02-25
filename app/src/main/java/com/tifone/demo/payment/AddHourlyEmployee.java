package com.tifone.demo.payment;

public class AddHourlyEmployee extends AddEmployeeTransaction{
    private double itsHourlyRate;
    public AddHourlyEmployee(int empId, String name, String addr, double hourlyRate){
        super(empId, name, addr);
        itsHourlyRate = hourlyRate;
    }

    @Override
    public PaymentClassification getClassification() {
        return new HourlyClassification(itsHourlyRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new WeeklySchedule();
    }

    @Override
    public PaymentMethod getMethod() {
        return new HoldMethod();
    }
}
