package com.abinaya.assignment3;

public class Bank {
    // 1. Static - Bank class
    private static int totalAccounts = 0;

    public static void incrementAccounts() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}


