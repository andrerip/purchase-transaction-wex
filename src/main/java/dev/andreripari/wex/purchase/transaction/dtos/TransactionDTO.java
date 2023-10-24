package dev.andreripari.wex.purchase.transaction.dtos;

import dev.andreripari.wex.purchase.transaction.models.TransactionEntity;

import java.time.LocalDate;

public record TransactionDTO(
        Long id,
        String description,
        LocalDate date,
        Float amount
) {

    public TransactionDTO(TransactionEntity entity) {
        this(entity.getId(), entity.getDescription(), entity.getDate(), entity.getAmount());
    }

    public TransactionEntity toTransactionEntity() {
        return new TransactionEntity(description, date, amount);
    }

}
