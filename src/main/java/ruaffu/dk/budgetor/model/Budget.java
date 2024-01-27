package ruaffu.dk.budgetor.model;

import java.time.*;

import jakarta.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;
	private String category;
	private LocalDate startDate;
	private LocalDate endDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
