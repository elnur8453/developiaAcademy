package az.developia.library_elnur;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibrarianAddRequestDTO {
	
	@NotNull(message="librarian first_name must be not null")
	@NotBlank(message="librarian first_name must be not blank")
	private String firstName;
	
	@NotNull(message="librarian last_name must be not null")
	@NotBlank(message="librarian last_name must be not blank")
    private String lastName;
	
	@NotNull(message="librarian phone must be not null")
	@NotBlank(message="librarian phone must be not blank")
    private String phone;
	
	@NotNull(message="librarian address must be not null")
	@NotBlank(message="librarian address must be not blank")
    private String address;
	
	@NotBlank(message = "librarian email must be not null")
    private String email;
	
    @NotNull(message="librarian password must be not null")
	@NotBlank(message="librarian password must be not blank")
    private String password;
}
