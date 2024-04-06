package ruaffu.dk.budgetor.repository;

import java.util.*;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import ruaffu.dk.budgetor.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	Optional<List<Transaction>> findByUserId(Long userId);
}
