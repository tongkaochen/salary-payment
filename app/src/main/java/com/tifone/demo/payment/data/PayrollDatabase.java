package com.tifone.demo.payment.data;

import com.tifone.demo.payment.Employee;
import com.tifone.demo.payment.PaymentMethod;

import java.util.HashMap;
import java.util.Map;

public class PayrollDatabase {
    private static Map<Integer, Employee> itsEmployees = new HashMap<>();

    private PayrollDatabase() {}
    public static Employee getEmployee(int empId) {
        return itsEmployees.get(empId);
    }
    public static void addEmployee(int empId, Employee e) {
        itsEmployees.put(empId, e);
    }
}
