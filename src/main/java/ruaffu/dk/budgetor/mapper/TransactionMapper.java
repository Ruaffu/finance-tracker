package ruaffu.dk.budgetor.mapper;

import java.util.*;
import java.util.stream.*;

import ruaffu.dk.budgetor.dto.TransactionDTO;
import ruaffu.dk.budgetor.model.Transaction;

public class TransactionMapper {

	public static TransactionDTO transactionToTransactionDTO(Transaction transaction) {
		if (transaction == null) {
			return null;
		}

		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setId(transaction.getId());
		transactionDTO.setAmount(transaction.getAmount());
		transactionDTO.setTransactionDate(transaction.getTransactionDate());
		transactionDTO.setDescription(transaction.getDescription());
		transactionDTO.setCategory(transaction.getCategory());
		return transactionDTO;
	}

	public static List<TransactionDTO> mapTransactionsToDtos(List<Transaction> transactions) {
		if (transactions == null) {
			return Collections.singletonList((TransactionDTO) Collections.emptyList());
		}

		return transactions.stream()
				.map(TransactionMapper::transactionToTransactionDTO)
				.collect(Collectors.toList());
	}
}
