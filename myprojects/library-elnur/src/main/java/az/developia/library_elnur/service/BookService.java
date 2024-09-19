package az.developia.library_elnur.service;

import org.springframework.stereotype.Service;

import az.developia.library_elnur.request.BookAddRequestDTO;
import az.developia.library_elnur.response.BookListResponseDTO;
import az.developia.library_elnur.response.BookResponseDTO;

@Service
public interface BookService {
	void add(BookAddRequestDTO req);

	BookListResponseDTO findAll();

	BookResponseDTO findById(Long id);

	void deleteById(Long id);
	
}
