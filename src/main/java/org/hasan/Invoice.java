package org.hasan;
import java.time.LocalDate;
public class Invoice {
    private double amount;
    private LocalDate date;

    public Invoice(double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}