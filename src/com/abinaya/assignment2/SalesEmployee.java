package com.abinaya.assignment2;

import java.util.Scanner;

public class SalesEmployee {
    // Part 2: SalesEmployee Class

    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission; // To store the calculated commission

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter Sales Employee Details:");
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        this.phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        this.salesAmount = scanner.nextDouble();
        // scanner.nextLine(); // Consume the remaining newline character
    }

    // Method to calculate and display the commission
    public void calculateAndDisplayCommission() {
        if (this.salesAmount >= 100000) {
            this.commission = 0.10 * this.salesAmount; // 10%
        } else if (this.salesAmount >= 50000 && this.salesAmount < 100000) {
            this.commission = 0.05 * this.salesAmount; // 5%
        } else if (this.salesAmount < 50000) { // Assuming 3% for < 50000 as per common interpretation of the question
            this.commission = 0.03 * this.salesAmount; // 3%
        } else {
            // This else block should ideally not be reached with typical positive sales amounts.
            // It's a safeguard for negative or zero sales if the problem implied it.
            this.commission = 0.0;
        }

        System.out.println("\n--- Sales Employee Commission Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
        System.out.println("Sales Amount: $" + String.format("%.2f", this.salesAmount));
        System.out.println("Calculated Commission: $" + String.format("%.2f", this.commission));
        System.out.println("----------------------------------------");
    }
}


