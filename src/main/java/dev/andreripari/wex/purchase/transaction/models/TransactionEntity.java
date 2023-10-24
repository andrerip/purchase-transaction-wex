package dev.andreripari.wex.purchase.transaction.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "transaction")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String description;

    @Column
    private LocalDate date;

    @Column(precision = 2)
    private Float amount;

    public TransactionEntity() {

    }

    public TransactionEntity(String description, LocalDate date, Float amount) {
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
