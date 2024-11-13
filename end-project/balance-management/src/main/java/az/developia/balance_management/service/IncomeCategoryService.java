package az.developia.balance_management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.balance_management.entity.IncomeCategoryEntity;
import az.developia.balance_management.exception.OurRuntimeException;
import az.developia.balance_management.repository.IncomeCategoryRepository;
import az.developia.balance_management.request.IncomeCategoryAddRequest;
import az.developia.balance_management.request.IncomeCategoryUpdateRequest;
import az.developia.balance_management.response.IncomeCategoryListResponse;
import az.developia.balance_management.response.IncomeCategoryResponse;

@Service
public class IncomeCategoryService {
	
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private IncomeCategoryRepository incomeRepository;
	
	public void createIncomeCategory(IncomeCategoryAddRequest request) {
		IncomeCategoryEntity income = new IncomeCategoryEntity();
		income.setName(request.getName());
		incomeRepository.save(income);
	}

	public IncomeCategoryListResponse getIncomeCategories(String name, int begin, int length) {

		List<IncomeCategoryEntity> entities = incomeRepository.findAllPagination(name, begin, length);

		List<IncomeCategoryResponse> respList = new ArrayList<IncomeCategoryResponse>();

		for (IncomeCategoryEntity entity : entities) {
			IncomeCategoryResponse response = new IncomeCategoryResponse();
			mapper.map(entity, response);
			respList.add(response);
		}

		IncomeCategoryListResponse response = new IncomeCategoryListResponse();
		response.setIncomeCategories(respList);
		return response;
	}
	
	
	public void updateIncomeCategory(IncomeCategoryUpdateRequest updateRequest) {
		Integer id = updateRequest.getId();
		if(id == null || id == 0) {
			throw new OurRuntimeException("id mutleqdir");
		}		
		IncomeCategoryEntity findedCategory = incomeRepository.findById(id).orElseThrow(() -> new OurRuntimeException("kateqoriya tapilmadi"));
		
		mapper.map(updateRequest, findedCategory);
	    incomeRepository.save(findedCategory);
	}
    
	
	public void deleteById(Integer id) {
		if (id == null || id == 0) {
	        throw new OurRuntimeException("ID mütləqdir");
	    }

		Optional<IncomeCategoryEntity> op = incomeRepository.findById(id);
	    if (op.isPresent()) {
	        incomeRepository.deleteById(id);
	    } else {
	        throw new OurRuntimeException("Kateqoriya tapılmadı");
	    }
	}
}
