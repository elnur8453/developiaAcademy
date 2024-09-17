package az.developia.Book_api.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import az.developia.Book_api.entity.BookEntity;
import az.developia.Book_api.exception.OurException;
import az.developia.Book_api.repository.BookRepository;
import az.developia.Book_api.request.BookAddRequestDTO;
import az.developia.Book_api.request.BookUpdateRequestDTO;
import az.developia.Book_api.response.BookListResponseDTO;
import az.developia.Book_api.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

	private final BookRepository repository;
	
	private final ModelMapper mapper;

	@Override
	public void add(BookAddRequestDTO req) {
		BookEntity entity = new BookEntity();	
		mapper.map(req, entity);
		repository.save(entity);
	}

	@Override
	public BookListResponseDTO findAll() {
		return null;
	}

	@Override
	public BookResponseDTO findById(Long id) {
		BookEntity entity = repository.findById(id).orElseThrow(()->new OurException("kitab tapilmadi", "",null));
		BookResponseDTO dto = new BookResponseDTO();
		mapper.map(entity, dto);
		return dto;
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void update(BookUpdateRequestDTO req) {
		Long id = req.getId();
		BookEntity entity = repository.findById(id).orElseThrow(()->new OurException("kitab tapilmadi", "",null));
		mapper.map(req, entity);
		repository.save(entity);
	}

}
