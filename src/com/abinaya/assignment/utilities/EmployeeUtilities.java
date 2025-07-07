public class EmployeeUtilities {

    package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Employee;

/**
 * Provides utility methods for Employee operations.
 */
public class EmployeeUtilities {

    /**
     * Increases the salary of an employee by the given percentage.
     */
    public static void giveRaise(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
    }

    /**
     * Displays basic info about an employee.
     */
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}


}
