package ruaffu.dk.budgetor.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.*;

import ruaffu.dk.budgetor.dto.TransactionDTO;
import ruaffu.dk.budgetor.service.TransactionService;

@RestController
@Slf4j
@RequestMapping("/api/transactions")
public class TransactionController {
	@Autowired
	TransactionService transactionService;

	@GetMapping("/all/{userId}")
	public ResponseEntity<List<TransactionDTO>> getAllTransactionsForUser(@PathVariable Long userId) {
		log.info("Get all transactions for user: {}", userId);
		return ResponseEntity.ok(transactionService.getAllTransactionsForUser(userId));

	}
}
