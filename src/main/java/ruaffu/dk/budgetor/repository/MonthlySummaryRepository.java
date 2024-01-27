package ruaffu.dk.budgetor.repository;

import org.springframework.data.jpa.repository.*;

import ruaffu.dk.budgetor.model.MonthlySummary;

public interface MonthlySummaryRepository extends JpaRepository<MonthlySummary, Long> {
}
