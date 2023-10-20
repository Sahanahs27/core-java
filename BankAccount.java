package com.xworkz.yono.sbi;

public class BankAccount {

    private double balance;
    public void debit(int amount) {
        if (amount <= balance)
            balance = balance - amount;
        System.out.println("remaining balance is: " +balance);
    }
    public void credit(int amount){
        this.balance = balance + amount;
    }

    public void transfer(int amount, BankAccount beneficiaryAccount){
       this.debit(amount);
       beneficiaryAccount.credit(amount);
    }

    public double getBalance() {
        return balance;
    }
}
