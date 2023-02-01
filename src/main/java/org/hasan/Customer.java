package org.hasan;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String name;
    private String sector;
    private LocalDate registerDate;
    private Set<Invoice> invoices = new HashSet<>();

    public Customer(String name, String sector, LocalDate registerDate) {
        this.name = name;
        this.sector = sector;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public String getSector() {
        return sector;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }
}