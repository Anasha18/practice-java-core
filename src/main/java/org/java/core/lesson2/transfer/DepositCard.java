package org.java.core.lesson2.transfer;

public class DepositCard extends AccountInfo implements BankAccountOperations {
    private int currentDate;
    private double step;
    private int dateAfterNoTransfers;

    public DepositCard(
            String accoountName,
            double balance,
            int createdAt,
            double step,
            int dateAfterNoTransfers
    ) {
        super(accoountName, balance);
        this.currentDate = createdAt;
        this.step = step;
        this.dateAfterNoTransfers = dateAfterNoTransfers;
    }

    public int getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(int currentDate) {
        this.currentDate = currentDate;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public int getDateAfterNoTransfers() {
        return dateAfterNoTransfers;
    }

    public void setDateAfterNoTransfers(int dateAfterNoTransfers) {
        this.dateAfterNoTransfers = dateAfterNoTransfers;
    }

    @Override
    public void transfer(double amount) {
        applyRestrictions(amount);

        balance -= amount;
        step++;
    }

    @Override
    public void applyRestrictions(double amount) {
        if (dateAfterNoTransfers > currentDate) {
            throw new RuntimeException("Date after transfer");
        }
    }

    @Override
    public String toString() {
        return "DepositCard{" +
                "currentDate=" + currentDate +
                ", step=" + step +
                ", dateAfterNoTransfers=" + dateAfterNoTransfers +
                ", accoountName='" + accoountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
