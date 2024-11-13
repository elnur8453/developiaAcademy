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
import az.developia.balance_management.request.ExpenseCategoryAddRequest;
import az.developia.balance_management.request.ExpenseCategoryUpdateRequest;
import az.developia.balance_management.response.ExpenseCategoryListResponse;
import az.developia.balance_management.service.ExpenseCategoryService;
import az.developia.balance_management.service.IncomeCategoryService;

@RestController
@RequestMapping("/expense-categories")
public class ExpenseCategoryController {

	@Autowired
	private ExpenseCategoryService expenseService;
	
	//xərc kateqoriyası yaratmaq
	@PostMapping(path = "/create-expense-category")
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_EXPENSE_CATEGORY')")
	public void addExpenseCategory(@RequestBody ExpenseCategoryAddRequest addRequest, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException("melumatlarin tamligi pozulub", "", br);
		}
		expenseService.createExpenseCategory(addRequest);
	}
	
	//Xərc kateqoriyalarını əldə etmək
	@GetMapping(path = "/get-expense-categories")
	@PreAuthorize(value = "hasAuthority('ROLE_GET_EXPENSE_CATEGORY_LIST')")
	public ExpenseCategoryListResponse getExpenseCategories (@RequestParam(name = "name", required = false, defaultValue = "") String name,
			@RequestParam(name = "begin", required = false, defaultValue = "0") Integer begin,
			@RequestParam(name = "length", required = false, defaultValue = "10") Integer length) {
		return expenseService.getExpenseCategories(name, begin, length);
	}
	
	//xerc kateqoriyasini yenilemek
	@PutMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_UPDATE_EXPENSE_CATEGORY')")
	public void updateExpenseCategory(@RequestBody ExpenseCategoryUpdateRequest updateRequest) {
		expenseService.updateExpenseCategory(updateRequest);
	}
	
	//xerc kateqoriya silmek
	@DeleteMapping("/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_DELETE_EXPENSE_CATEGORY')")
	public void deleteEexpenseCategory(@PathVariable Integer id) {
		expenseService.deleteById(id);
	}
}
