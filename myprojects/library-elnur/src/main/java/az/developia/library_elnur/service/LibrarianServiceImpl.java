package az.developia.library_elnur.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import az.developia.library_elnur.LibrarianAddRequestDTO;
import az.developia.library_elnur.entity.LibrarianEntity;
import az.developia.library_elnur.repository.LibrarianRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibrarianServiceImpl implements LibrarianService {

	private final LibrarianRepository librarianRepository;

	private final ModelMapper mapper;

	@Override
	public void registerLibrarian(LibrarianAddRequestDTO registrationDTO) {
		LibrarianEntity librarian = mapper.map(registrationDTO, LibrarianEntity.class);
		librarianRepository.save(librarian);
	}

}
