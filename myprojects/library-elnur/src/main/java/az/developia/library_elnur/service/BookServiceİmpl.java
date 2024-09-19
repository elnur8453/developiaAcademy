package az.developia.library_elnur.service;

import org.springframework.stereotype.Service;

import az.developia.library_elnur.repository.BookRepository;
import az.developia.library_elnur.request.BookAddRequestDTO;
import az.developia.library_elnur.response.BookListResponseDTO;
import az.developia.library_elnur.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookServiceİmpl implements BookService{
	
	private final BookRepository bookrepository;

	@Override
	public void add(BookAddRequestDTO req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookListResponseDTO findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookResponseDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
 		
	}

}
