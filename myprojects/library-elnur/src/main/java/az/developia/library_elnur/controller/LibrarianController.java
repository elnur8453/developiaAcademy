package az.developia.library_elnur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.library_elnur.service.LibrarianService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/librarians")

public class LibrarianController {

	private LibrarianService libService;
	
}
