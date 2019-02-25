package com.tifone.demo.payment;

import com.tifone.demo.payment.data.PayrollDatabase;

public abstract class AddEmployeeTransaction implements Transaction {
    private int itsEmpid;
    private String itsName;
    private String itsAddress;
    public AddEmployeeTransaction(int empid, String name,
                                  String addr) {
        itsEmpid = empid;
        itsName = name;
        itsAddress = addr;
    }
    @Override
    public void execute() {
        PaymentClassification classification = getClassification();
        PaymentSchedule schedule = getSchedule();
        PaymentMethod method = getMethod();
        Employee employee = new Employee(itsEmpid, itsName, itsAddress);
        employee.setClassification(classification);
        employee.setSchedule(schedule);
        employee.setMethod(method);
        PayrollDatabase.addEmployee(itsEmpid, employee);
    }
    public abstract PaymentClassification getClassification();
    public abstract PaymentSchedule getSchedule();
    public abstract PaymentMethod getMethod();
}
