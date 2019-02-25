package com.tifone.demo.payment;

import com.tifone.demo.payment.data.PayrollDatabase;

import static org.junit.Assert.*;
import org.junit.Test;

public class PayrollTest {

    @Test
    public void testSalariedAddEmployee() {
        int empId = 1;
        AddSalariedEmployee employee = new AddSalariedEmployee(empId, "Bob", "Home", 1000.00);
        employee.execute();

        Employee e = PayrollDatabase.getEmployee(empId);
        assertEquals("Bob", e.getName());

        PaymentClassification pc = e.getClassification();
        SalariedClassification sc = (SalariedClassification) pc;
        assertNotNull(sc);

        assertEquals(1000.00, sc.getSalary(), 0.001);
        PaymentSchedule ps = e.getSchedule();
        MonthlySchedule ms = (MonthlySchedule) ps;
        assertNotNull(ms);

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod)pm;
        assertNotNull(hm);
    }

    @Test
    public void testAddHourlyEmployee() {
        int empId = 2;
        AddHourlyEmployee employee = new AddHourlyEmployee(empId, "Jack", "Home", 16.0);
        employee.execute();

        Employee e = PayrollDatabase.getEmployee(empId);
        assertEquals("Jack", e.getName());

        PaymentSchedule ps = e.getSchedule();
        WeeklySchedule ws = (WeeklySchedule)ps;
        assertNotNull(ws);

        PaymentClassification pc = e.getClassification();
        HourlyClassification hc = (HourlyClassification)pc;
        assertNotNull(hc);

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod)pm;
        assertNotNull(hm);
    }

    @Test
    public void testAddCommissionEmployee() {
        int empId = 3;
        AddCommissionEmployee employee = new AddCommissionEmployee(empId,
                "Make", "School", 2000.00, 20.0);
        employee.execute();

        Employee e = PayrollDatabase.getEmployee(empId);

        PaymentSchedule ps = e.getSchedule();
        BiweeklySchedule bs = (BiweeklySchedule)ps;
        assertNotNull(bs);

        PaymentClassification pc = e.getClassification();
        CommissionClassification cc = (CommissionClassification)pc;
        assertNotNull(cc);

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod)pm;
        assertNotNull(hm);
    }
}
