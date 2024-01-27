package ruaffu.dk.budgetor.model;

import java.time.*;

import jakarta.persistence.*;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;
	private LocalDate transactionDate;
	private String description;
	private String category;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
