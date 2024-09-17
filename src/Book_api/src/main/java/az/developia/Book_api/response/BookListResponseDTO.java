package az.developia.Book_api.response;

import java.util.List;
import lombok.Data;

@Data
public class BookListResponseDTO {
	private List<BookResponseDTO> books;
}
