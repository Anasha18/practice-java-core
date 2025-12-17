package org.java.core.lesson2.transfer;

public class CreditCard extends AccountInfo implements BankAccountOperations {
    private double step;
    private double debt;
    private double fee;
    private double amountFromStartFee;

    public CreditCard(
            String accoountName,
            double balance,
            double step,
            double debt,
            double fee,
            double amountFromStartFee
    ) {
        super(accoountName, balance);
        this.step = step;
        this.debt = debt;
        this.fee = fee;
        this.amountFromStartFee = amountFromStartFee;
    }

    @Override
    public void transfer(double amount) {
        applyRestrictions(amount);

        balance -= amount;
        step++;
    }

    @Override
    public void applyRestrictions(double amount) {
        if (amount > amountFromStartFee) {
            balance -= fee;
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "step=" + step +
                ", debt=" + debt +
                ", fee=" + fee +
                ", amountFromStartFee=" + amountFromStartFee +
                ", accoountName='" + accoountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

