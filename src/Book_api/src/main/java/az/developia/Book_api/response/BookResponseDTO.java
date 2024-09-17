package az.developia.Book_api.response;

import lombok.Data;

@Data
public class BookResponseDTO {
	private Long id;
	private String name;
	private String author;
	private double price;
	private int pageCount;
}
