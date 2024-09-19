package az.developia.library_elnur;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class LibrarianRegistrationDTO {
	
	@NotNull(message="kitabxanaçı adı daxil edilməlidir")
	@NotBlank(message="kitabxanaçı adı boş qala bilməz")
	private String firstName;
	
	@NotNull(message="kitabxanaçı soyadı daxil edilməlidir")
	@NotBlank(message="kitabxanaçı soyadı boş qala bilməz")
    private String lastName;
	
	@NotNull(message = "telefon nömrəsi daxil edilməlidir")
	@NotBlank(message="telefon nömrəsi boş qala bilməz")
	@Max(value = 25,message = "telefon nömrəsi max 25 ola bilər")
    private String phone;
	
	@NotNull(message="address daxil edilməlidir")
	@NotBlank(message = "address boş qoymaq olmaz")
    private String address;
	
	@NotBlank(message = "email boş qoymaq olmaz")
	@Pattern(regexp = "(?=^.{4,40}$)[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\\\.[a-zA-Z]{2,4}$", message = "email mütleq bu simvollara uyğun olmalidir")
    private String email;
	
	@NotNull(message="password adı daxil edilməlidir")
	@NotBlank(message="password adı boş qala bilməz")
    private String password;
}
