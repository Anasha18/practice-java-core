package org.java.core.lesson2.transfer;

public class DebitCard extends AccountInfo implements BankAccountOperations {
    private double transferToLimit;

    public DebitCard(
            String accoountName,
            double balance,
            double limitToTransfer) {
        super(accoountName, balance);
        this.transferToLimit = limitToTransfer;
    }

    public double getTransferToLimit() {
        return transferToLimit;
    }

    public void setTransferToLimit(double transferToLimit) {
        this.transferToLimit = transferToLimit;
    }

    @Override
    public void transfer(double amount) {
        applyRestrictions(amount);

        balance -= amount;
    }

    @Override
    public void applyRestrictions(double amount) {
        if (amount > transferToLimit) throw new RuntimeException("Amount exceeds transfer limit");
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "transferToLimit=" + transferToLimit +
                ", accoountName='" + accoountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
