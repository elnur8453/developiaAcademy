package az.developia.library_elnur.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import az.developia.library_elnur.LibrarianLoginDTO;
import az.developia.library_elnur.LibrarianRegistrationDTO;
import az.developia.library_elnur.entity.LibrarianEntity;
import az.developia.library_elnur.repository.LibrarianRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibrarianServiceİmpl implements LibrarianService{
	
	private final LibrarianRepository librarianRepository;
	
	private final ModelMapper mapper;


	@Override
	public void registerLibrarian(LibrarianRegistrationDTO registrationDTO) {
		LibrarianEntity entity = new LibrarianEntity();
		mapper.map(registrationDTO, entity);
		librarianRepository.save(entity);
	}

	@Override
	public Optional<LibrarianEntity> loginLibrarian(LibrarianLoginDTO loginDTO) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
