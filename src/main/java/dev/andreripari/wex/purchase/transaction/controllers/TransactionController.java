package dev.andreripari.wex.purchase.transaction.controllers;

import dev.andreripari.wex.purchase.transaction.dtos.TransactionDTO;
import dev.andreripari.wex.purchase.transaction.services.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class TransactionController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TransactionController.class);
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transactions")
    @ResponseStatus(HttpStatus.CREATED)
    public TransactionDTO createTransaction(@RequestBody TransactionDTO transaction) {
        return transactionService.createTransaction(transaction);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public final Exception handleAllExceptions(RuntimeException e) {
        LOGGER.error("Internal server error.", e);
        return e;
    }
}
