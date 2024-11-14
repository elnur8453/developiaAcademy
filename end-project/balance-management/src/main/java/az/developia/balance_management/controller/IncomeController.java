package az.developia.balance_management.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.balance_management.exception.OurRuntimeException;
import az.developia.balance_management.reponse.IncomeListResponse;
import az.developia.balance_management.request.IncomeAddRequest;
import az.developia.balance_management.request.IncomeUpdateRequest;
import az.developia.balance_management.service.IncomeService;

@RestController
@RequestMapping("/incomes")
public class IncomeController {

	@Autowired
	private IncomeService incomeService;

	@PostMapping(path = "/create-income-category")
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_INCOME')")
	public void addIncome(@RequestBody IncomeAddRequest addRequest, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException("melumatlarin tamligi pozulub", "", br);
		}
		incomeService.createIncome(addRequest);
	}
	
	@GetMapping()
	@PreAuthorize(value = "hasAuthority('ROLE_GET_INCOME')")
	public IncomeListResponse getAllIncomeByFilter(
			@RequestParam(name = "begin", required = false, defaultValue = "0") Integer begin,
			@RequestParam(name = "length", required = false, defaultValue = "10") Integer length) {

		return incomeService.getAllIncome(begin, length);

	}

	@GetMapping(path = "/get-all-by-category-and-date")
	@PreAuthorize(value = "hasAuthority('ROLE_GET_INCOME')")
	public IncomeListResponse getAllIncome(
			@RequestParam(name = "category_id", required = true) Integer categoryId,
			@RequestParam(name = "start_date", required = true) LocalDate startDate,
			@RequestParam(name = "end_date", required = true) LocalDate endDate,
			@RequestParam(name = "begin", required = false, defaultValue = "0") Integer begin,
			@RequestParam(name = "length", required = false, defaultValue = "10") Integer length) {

		return incomeService.getAllIncomeByFilter(categoryId, startDate, endDate, begin, length);

	}
	
	@GetMapping(path = "/get-all-by-date")
	@PreAuthorize(value = "hasAuthority('ROLE_GET_INCOME')")
	public IncomeListResponse getAllIncomeByDate(
			@RequestParam(name = "start_date", required = true) LocalDate startDate,
			@RequestParam(name = "end_date", required = true) LocalDate endDate,
			@RequestParam(name = "begin", required = false, defaultValue = "0") Integer begin,
			@RequestParam(name = "length", required = false, defaultValue = "10") Integer length) {

		return incomeService.getAllIncomeByDate(startDate, endDate, begin, length);

	}
	
	@PutMapping
	@PreAuthorize(value = "hasAuthority('ROLE_UPDATE_INCOME')")
	public void updateIncome(@RequestBody IncomeUpdateRequest updateRequest) {
		incomeService.updateIncome(updateRequest);
	}
	
	@DeleteMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_DELETE_INCOME')")
	public void deleteIncome(@PathVariable Integer id) {
		incomeService.deleteById(id);
	}
}
