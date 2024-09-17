package az.developia.Book_api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTOEntity {
	
	  private Long id;
	  
	  private String name;
	  
	  private Double price;
	  
	  private Integer pageCount;
	  
	  private String author;
}
