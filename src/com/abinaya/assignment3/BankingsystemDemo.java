package com.abinaya.assignment3;


    // Main class to test everything
public class BankingsystemDemo {
    public static void main(String[] args) {
        SavingsAccount alice = new SavingsAccount("Alice", 1000.0);
        CheckingAccount bob = new CheckingAccount("Bob", 500.0);

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());

        Transaction txn = new Transaction();
        txn.performTransaction(alice, bob, 200.0);

        System.out.println("\n--- Final Balances ---");
        System.out.println("Alice (Savings): " + alice.getBalance());
        System.out.println("Bob (Checking): " + bob.getBalance());

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}


