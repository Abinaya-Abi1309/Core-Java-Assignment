package com.abinaya.assignment2;

public class Main {
    // Main class to run the program

    public static void main(String[] args) {
        // Test Part 1: Student Class
        System.out.println("Testing Student Class:");
        Student myStudent = new Student(); // This will call the default constructor and print the message
        System.out.println(); // Just for spacing

        // Test Part 2: SalesEmployee Class
        System.out.println("Testing Sales Employee Class:");
        SalesEmployee employee1 = new SalesEmployee(); // Create an object of SalesEmployee
        employee1.acceptDetails();                      // Call method to accept details
        employee1.calculateAndDisplayCommission();      // Call method to calculate and display commission

        // You can create another employee to test again if you wish
        // SalesEmployee employee2 = new SalesEmployee();
        // employee2.acceptDetails();
        // employee2.calculateAndDisplayCommission();
    }
}


