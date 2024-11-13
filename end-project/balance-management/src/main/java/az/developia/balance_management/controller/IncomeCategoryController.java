package az.developia.balance_management.controller;

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
import az.developia.balance_management.request.IncomeCategoryAddRequest;
import az.developia.balance_management.request.IncomeCategoryUpdateRequest;
import az.developia.balance_management.response.IncomeCategoryListResponse;
import az.developia.balance_management.service.IncomeCategoryService;

@RestController
@RequestMapping("/income-categories")
public class IncomeCategoryController {

	@Autowired
	private IncomeCategoryService incomeService;

	@PostMapping(path = "/create-income-category")
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_INCOME_CATEGORY')")
	public void addIncomeCategory(@RequestBody IncomeCategoryAddRequest addRequest, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException("melumatlarin tamligi pozulub", "", br);
		}
		incomeService.createIncomeCategory(addRequest);
	}

	
	@GetMapping(path = "/get-income-categories")
	@PreAuthorize(value = "hasAuthority('ROLE_GET_INCOME_CATEGORY_LIST')")
	public IncomeCategoryListResponse getExpenseCategories(
			@RequestParam(name = "name", required = false, defaultValue = "") String name,
			@RequestParam(name = "begin", required = false, defaultValue = "0") Integer begin,
			@RequestParam(name = "length", required = false, defaultValue = "10") Integer length) {
		return incomeService.getIncomeCategories(name, begin, length);
	}

	
	@PutMapping()
	@PreAuthorize(value = "hasAuthority('ROLE_UPDATE_INCOME_CATEGORY')")
	public void updateIncomeCategory(@RequestBody IncomeCategoryUpdateRequest updateRequest) {
		incomeService.updateIncomeCategory(updateRequest);
	}

	
	@DeleteMapping("/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_DELETE_INCOME_CATEGORY')")
	public void deleteIncomeCategory(@PathVariable Integer id) {
		incomeService.deleteById(id);
	}
}
