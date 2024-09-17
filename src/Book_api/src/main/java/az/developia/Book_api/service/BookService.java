package az.developia.Book_api.service;

import org.springframework.stereotype.Service;

import az.developia.Book_api.request.BookAddRequestDTO;
import az.developia.Book_api.request.BookUpdateNameRequestDTO;
import az.developia.Book_api.request.BookUpdateRequestDTO;
import az.developia.Book_api.response.BookListResponseDTO;
import az.developia.Book_api.response.BookResponseDTO;

@Service
public interface BookService {

	void add(BookAddRequestDTO req);

	BookListResponseDTO findAll();

	BookResponseDTO findById(Long id);

	void deleteById(Long id);
	
	void update(BookUpdateRequestDTO req);
	
	void updateName(BookUpdateNameRequestDTO req);

}
