package ruaffu.dk.budgetor.repository;

import org.springframework.data.jpa.repository.*;

import ruaffu.dk.budgetor.model.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
