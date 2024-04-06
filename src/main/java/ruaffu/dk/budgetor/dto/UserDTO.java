package ruaffu.dk.budgetor.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
	private Long id;
	private String username;
	private String email;
}
