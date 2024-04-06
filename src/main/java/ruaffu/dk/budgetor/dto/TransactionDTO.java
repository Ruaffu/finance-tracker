package ruaffu.dk.budgetor.dto;

import java.time.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransactionDTO {
	private Long id;
	private Double amount;
	private LocalDate transactionDate;
	private String description;
	private String category;
	private Long userId; // Reference to the user
}
