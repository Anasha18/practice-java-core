package org.java.core.lesson3.transaction_work;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Transaction {
    enum Status {
        SUCCESS,
        FAILED,
        WAITING,
    }

    private String id;
    private BigDecimal sum;
    private LocalDate date;
    private Status status;

    public Transaction(
            String id,
            BigDecimal sum,
            LocalDate date,
            Status status
    ) {
        this.id = id;
        this.sum = sum;
        this.date = date;
        this.status = status;
    }

    public Transaction() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", sum=" + sum +
                ", date=" + date +
                ", status=" + status +
                '}';
    }

    public void applyFee() {

        if (status != Status.SUCCESS) return;

        sum = sum
                .multiply(new BigDecimal("0.9"))
                .setScale(2, RoundingMode.HALF_UP);
    }

    public String toCSV() {
        return id + ";" + sum + ";" + date + ";" + status + "\n";
    }
}
