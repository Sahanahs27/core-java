package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.sbi.BankAccount;

public class SavingAccount extends BankAccount {
    double interestRate;
    public SavingAccount(){

    }
    public SavingAccount(double minBalance){
        this.credit((int)minBalance);
    }


    public void calculateInterestRate() {
        double interestAmount = interestRate * getBalance();
    }
}
/* plaform indepent  bute code
development tool - jdk handles compile tyme whict containc compiler. this is called compile tyme
 jre handles  by runtime which contain jvm.
jre contains jvm
 1 class loader - help to load the code.
2. byte cde verfier -
3. interpreter read the byte code stream(continous data/output) line by line and display the output
4. display the output
java memory
1.heap memory - object stored
2. meta space - class stored
static - commom/shared data for diff object- single copy of particular class - metaspace memory - it exceutes only once
it store outside the object -
instance - multiple copy per class - after the object creation - multiple tymes
 */