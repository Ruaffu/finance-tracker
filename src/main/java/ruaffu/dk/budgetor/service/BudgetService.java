package ruaffu.dk.budgetor.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import ruaffu.dk.budgetor.model.Budget;
import ruaffu.dk.budgetor.repository.BudgetRepository;

@Service
public class BudgetService {

	@Autowired
	private BudgetRepository budgetRepository;

	public List<Budget> getAllBudgets() {
		return budgetRepository.findAll();
	}
}
