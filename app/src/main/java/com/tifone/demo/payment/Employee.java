package com.tifone.demo.payment;

public class Employee {
    private int itsEmpId;
    private String itsName;
    private String itsAddr;
    private PaymentClassification itsClassification;
    private PaymentSchedule itsSchedule;
    private PaymentMethod itsMethod;
    public Employee(int empId, String name, String addr) {
        itsEmpId = empId;
        itsName = name;
        itsAddr = addr;
    }
    public String getName() {
        return itsName;
    }

    public PaymentClassification getClassification() {
        return itsClassification;
    }

    public PaymentSchedule getSchedule() {
        return itsSchedule;
    }

    public PaymentMethod getMethod() {
        return itsMethod;
    }
    public void setClassification(PaymentClassification classification) {
        itsClassification = classification;
    }
    public void setMethod(PaymentMethod method) {
        itsMethod = method;
    }
    public void setSchedule(PaymentSchedule schedule) {
        itsSchedule = schedule;
    }
}
