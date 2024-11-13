package az.developia.balance_management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.balance_management.entity.ExpenseCategoryEntity;
import az.developia.balance_management.exception.OurRuntimeException;
import az.developia.balance_management.repository.ExpenseCategoryRepository;
import az.developia.balance_management.request.ExpenseCategoryAddRequest;
import az.developia.balance_management.request.ExpenseCategoryUpdateRequest;
import az.developia.balance_management.response.ExpenseCategoryListResponse;
import az.developia.balance_management.response.ExpenseCategoryResponse;

@Service
public class ExpenseCategoryService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private ExpenseCategoryRepository expenseRepository;

	
	public void createExpenseCategory(ExpenseCategoryAddRequest request) {
		ExpenseCategoryEntity expense = new ExpenseCategoryEntity();
		expense.setName(request.getName());
		expenseRepository.save(expense);
	}

	
	public ExpenseCategoryListResponse getExpenseCategories(String name, int begin, int length) {

		List<ExpenseCategoryEntity> entities = expenseRepository.findAllPagination(name, begin, length);

		List<ExpenseCategoryResponse> respList = new ArrayList<ExpenseCategoryResponse>();

		for (ExpenseCategoryEntity entity : entities) {
			ExpenseCategoryResponse response = new ExpenseCategoryResponse();
			mapper.map(entity, response);
			respList.add(response);
		}

		ExpenseCategoryListResponse response = new ExpenseCategoryListResponse();
		response.setExpenseCategories(respList);
		return response;
	}
	
	
	public void updateExpenseCategory(ExpenseCategoryUpdateRequest updateRequest) {
		Integer id = updateRequest.getId();
		if(id == null || id == 0) {
			throw new OurRuntimeException("id mutleqdir");
		}		
		ExpenseCategoryEntity findedCategory = expenseRepository.findById(id).orElseThrow(() -> new OurRuntimeException("kateqoriya tapilmadi"));
		
		mapper.map(updateRequest, findedCategory);
	    expenseRepository.save(findedCategory);
	}
    
	
	public void deleteById(Integer id) {
		if (id == null || id == 0) {
	        throw new OurRuntimeException("ID mütləqdir");
	    }

		Optional<ExpenseCategoryEntity> op = expenseRepository.findById(id);
	    if (op.isPresent()) {
	        expenseRepository.deleteById(id);
	    } else {
	        throw new OurRuntimeException("Kateqoriya tapılmadı");
	    }
	}
	
	
}
