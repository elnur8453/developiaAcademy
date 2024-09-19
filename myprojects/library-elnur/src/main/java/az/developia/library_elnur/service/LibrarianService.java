package az.developia.library_elnur.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import az.developia.library_elnur.LibrarianLoginDTO;
import az.developia.library_elnur.LibrarianRegistrationDTO;
import az.developia.library_elnur.entity.LibrarianEntity;

@Service
public interface LibrarianService {
	void registerLibrarian(LibrarianRegistrationDTO registrationDTO);
	Optional<LibrarianEntity> loginLibrarian(LibrarianLoginDTO loginDTO);
}
