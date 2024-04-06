package ruaffu.dk.budgetor.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MonthlySummaryDTO {
	private Long id;
	private Integer month;
	private Integer year;
	private Double totalIncome;
	private Double totalExpenses;
	private Double totalSavings;
	private Double budgetAllocated;
	private Double budgetRemaining;
	private Long userId;

}
