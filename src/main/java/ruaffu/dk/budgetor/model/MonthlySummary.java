package ruaffu.dk.budgetor.model;

import jakarta.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MonthlySummary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer month;
	private Integer year;
	private Double totalIncome;
	private Double totalExpense;
	private Double totalSavings;
	private Double budgetAllocated;
	private Double budgetRemaining;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
