package dev.andreripari.wex.purchase.transaction.services;

import dev.andreripari.wex.purchase.transaction.dtos.TransactionDTO;
import dev.andreripari.wex.purchase.transaction.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public TransactionDTO createTransaction(TransactionDTO dto) {
        return new TransactionDTO(transactionRepository.save(dto.toTransactionEntity()));
    }
}