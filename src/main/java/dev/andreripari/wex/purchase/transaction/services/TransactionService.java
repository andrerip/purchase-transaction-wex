package dev.andreripari.wex.purchase.transaction.services;

import dev.andreripari.wex.purchase.transaction.dtos.TransactionDTO;

public interface TransactionService {

    TransactionDTO createTransaction(TransactionDTO dto);
}
