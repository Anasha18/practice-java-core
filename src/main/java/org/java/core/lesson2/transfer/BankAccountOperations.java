package org.java.core.lesson2.transfer;

public interface BankAccountOperations {
    void transfer(double amount);

    void applyRestrictions(double amount);
}
