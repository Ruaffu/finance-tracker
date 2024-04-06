package ruaffu.dk.budgetor.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import ruaffu.dk.budgetor.dto.TransactionDTO;
import ruaffu.dk.budgetor.mapper.TransactionMapper;
import ruaffu.dk.budgetor.model.Transaction;
import ruaffu.dk.budgetor.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;

	public List<TransactionDTO> getAllTransactionsForUser(Long userId) {
		Optional<List<Transaction>> transaction = transactionRepository.findByUserId(userId);
		return TransactionMapper.mapTransactionsToDtos(transaction.get());
	}
}
