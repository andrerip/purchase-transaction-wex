package dev.andreripari.wex.purchase.transaction.repositories;

import dev.andreripari.wex.purchase.transaction.models.TransactionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {

}
