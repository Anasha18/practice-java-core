package org.java.core.lesson2.transfer;

public class AccountInfo {
    protected String accoountName;
    protected double balance;

    public AccountInfo(
            String accoountName,
            double balance
    ) {
        this.accoountName = accoountName;
        this.balance = balance;
    }

    public String getAccoountName() {
        return accoountName;
    }

    public void setAccoountName(String accoountName) {
        this.accoountName = accoountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
