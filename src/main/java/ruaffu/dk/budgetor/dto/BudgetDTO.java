package ruaffu.dk.budgetor.dto;

import java.time.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BudgetDTO {
	private Long id;
	private Double amount;
	private String category;
	private LocalDate startDate;
	private LocalDate endDate;
	private Long userId; // Reference to the user
}
