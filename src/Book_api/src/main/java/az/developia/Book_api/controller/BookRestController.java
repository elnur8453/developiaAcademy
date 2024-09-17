package az.developia.Book_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import az.developia.Book_api.exception.OurException;
import az.developia.Book_api.request.BookAddRequestDTO;
import az.developia.Book_api.request.BookUpdateRequestDTO;
import az.developia.Book_api.response.BookResponseDTO;
import az.developia.Book_api.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

	private final BookService service;
	
	@PostMapping
	public void add(@Valid @RequestBody BookAddRequestDTO req,BindingResult br) {
		if(br.hasErrors()) {
			throw new OurException("melumatlarin tamligi pozulub", "",br);
		}
		service.add(req);
	}
	
	
	@PutMapping
	public void update(@Valid @RequestBody BookUpdateRequestDTO req,BindingResult br) {
		if(br.hasErrors()) {
			throw new OurException("melumatlarin tamligi pozulub", "",br);
		}
		service.update(req);
	}
	
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable Long id) {

		service.deleteById(id);
	}
	
	
	@GetMapping(path = "/{id}")
	public BookResponseDTO findById(@PathVariable Long id) {

		return service.findById(id);
	}
}
