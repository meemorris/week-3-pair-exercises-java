package com.techelevator.hr;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee sut = new Employee("Test", "Testerson");

        String fullName = sut.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee sut = new Employee("Test", "Testerson");
        sut.setSalary(100);

        sut.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",sut.getSalary(), 105, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee sut = new Employee("Test", "Testerson");
        sut.setSalary(100);
        sut.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, sut.getSalary(),0.0);
    }
}
