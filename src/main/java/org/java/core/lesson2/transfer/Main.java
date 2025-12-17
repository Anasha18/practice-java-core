package org.java.core.lesson2.transfer;

public class Main {
    public static void main(String[] args) {
        BankAccountOperations[] cards = {
                new DebitCard("debitCard", 100, 300),
                new DepositCard("depositCard", 1000, 100, 1, 50),
                new CreditCard("creditCard", 100, 1, 150, 30, 400)
        };

        for (BankAccountOperations card : cards) {
            card.transfer(100);
            System.out.println(card);
        }
    }
}
