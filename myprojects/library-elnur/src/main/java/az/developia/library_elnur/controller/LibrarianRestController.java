package az.developia.library_elnur.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import az.developia.library_elnur.LibrarianAddRequestDTO;
import az.developia.library_elnur.exception.OurException;
import az.developia.library_elnur.service.LibrarianServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/librarians")
@RequiredArgsConstructor
public class LibrarianRestController {

	private final LibrarianServiceImpl librarianService;
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@Valid @RequestBody LibrarianAddRequestDTO dto,BindingResult br){
		if(br.hasErrors()) {
			throw new OurException("melumatlarin tamligi pozulub", "",br);
		}
		librarianService.registerLibrarian(dto);;
	}
	
	
}
