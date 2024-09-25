package az.developia.library_elnur.service;

import org.springframework.stereotype.Service;

import az.developia.library_elnur.LibrarianAddRequestDTO;

@Service
public interface LibrarianService {
	void registerLibrarian(LibrarianAddRequestDTO registrationDTO);
	
}
