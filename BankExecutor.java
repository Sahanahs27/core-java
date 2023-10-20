package com.xworkz.yono;

import com.xworkz.yono.sbi.BankAccount;
import com.xworkz.yono.sbi.savings.SavingAccount;

public class BankExecutor {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.credit(5000);
        myAccount.credit(500);
        System.out.println("available balance: " +myAccount.getBalance());

        myAccount.debit(300);
        System.out.println("available balance:" +myAccount.getBalance());

        SavingAccount mySavingAccount = (SavingAccount) myAccount;
        mySavingAccount.calculateInterestRate();
        System.out.println("balance after interest rate " +mySavingAccount);
        System.out.println("available balance" +myAccount.getBalance());

        SavingAccount freindAccount = new SavingAccount();

        myAccount.transfer(200, freindAccount);
        System.out.println("transfering 200 to my friend account");
        System.out.println("available balance on my account:" +myAccount.getBalance());
        System.out.println("available baance on freiend account:" +freindAccount.getBalance());


        SavingAccount momAccount = new SavingAccount();
        momAccount.credit(500);
        System.out.println("crediting 500 to mom account");

        myAccount.transfer(200, momAccount);
        System.out.println("transfering 200 to my mom account");
        System.out.println("available balance on my account:" +myAccount.getBalance());
        System.out.println("available baance on mom account:" +momAccount.getBalance());

        SavingAccount dadAccount = new SavingAccount();
        dadAccount.credit(1000);
        System.out.println("crediting 1000 to dad account");

        myAccount.transfer(500, dadAccount);
        System.out.println("transfering 500 to my dad account");
        System.out.println("available balance on my account:" +myAccount.getBalance());
        System.out.println("available baance on dad account:" +dadAccount.getBalance());

        SavingAccount brotherAccount = new SavingAccount();
        brotherAccount.credit(300);
        System.out.println("crediting 300 to my brother");

        myAccount.transfer(200, brotherAccount);
        System.out.println("transfering 200 to my brother account");
        System.out.println("available balance on my account:" +myAccount.getBalance());
        System.out.println("available baance on brother account:" +brotherAccount.getBalance());

        SavingAccount sisterAccount = new SavingAccount();
        sisterAccount.credit(700);
        System.out.println("crediting 700 to my sister");

        myAccount.transfer(200, sisterAccount);
        System.out.println("transfering 200 to my sis account");
        System.out.println("available balance on my account:" +myAccount.getBalance());
        System.out.println("available baance on sis account:" +momAccount.getBalance());
    }
}
