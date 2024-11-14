package az.developia.balance_management.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.balance_management.entity.IncomeEntity;
import az.developia.balance_management.exception.OurRuntimeException;
import az.developia.balance_management.reponse.IncomeListResponse;
import az.developia.balance_management.reponse.IncomeResponse;
import az.developia.balance_management.repository.İncomeRepository;
import az.developia.balance_management.request.IncomeAddRequest;
import az.developia.balance_management.request.IncomeUpdateRequest;

@Service
public class IncomeService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private İncomeRepository incomeRepository;

	public void createIncome(IncomeAddRequest request) {
		IncomeEntity income = new IncomeEntity();
		mapper.map(request, income);
		incomeRepository.save(income);
	}
	
	public IncomeListResponse getAllIncome(Integer begin, Integer length) {
		List<IncomeEntity> incomes = incomeRepository.getAllIncome(begin, length);

		List<IncomeResponse> respList = new ArrayList<IncomeResponse>();

		for (IncomeEntity entity : incomes) {
			IncomeResponse response = new IncomeResponse();
			mapper.map(entity, response);
			respList.add(response);
		}

		IncomeListResponse response = new IncomeListResponse();
		response.setIncomes(respList);
		return response;

	}

	public IncomeListResponse getAllIncomeByFilter(Integer categoryId, LocalDate startDate, LocalDate endDate, Integer begin,
			Integer length) {
		List<IncomeEntity> incomes = incomeRepository.getAllIncomeByFilter(categoryId, startDate, endDate, begin, length);

		List<IncomeResponse> respList = new ArrayList<IncomeResponse>();

		for (IncomeEntity entity : incomes) {
			IncomeResponse response = new IncomeResponse();
			mapper.map(entity, response);
			respList.add(response);
		}

		IncomeListResponse response = new IncomeListResponse();
		response.setIncomes(respList);
		return response;

	}

	public IncomeListResponse getAllIncomeByDate(LocalDate startDate, LocalDate endDate, Integer begin, Integer length) {

		List<IncomeEntity> incomes = incomeRepository.getAllIncomeByDate(startDate, endDate, begin, length);

		List<IncomeResponse> respList = new ArrayList<IncomeResponse>();

		for (IncomeEntity entity : incomes) {
			IncomeResponse response = new IncomeResponse();
			mapper.map(entity, response);
			respList.add(response);
		}

		IncomeListResponse response = new IncomeListResponse();
		response.setIncomes(respList);
		return response;
	}

	public void updateIncome(IncomeUpdateRequest updateRequest) {
		Integer id = updateRequest.getId();
		if(id == null || id == 0) {
			throw new OurRuntimeException("ID mutleqdir");
		}
		IncomeEntity findedIncome = incomeRepository.findById(id).orElseThrow(()-> new OurRuntimeException("Gelir tapilmadi"));
		
		mapper.map(updateRequest, findedIncome);
		incomeRepository.save(findedIncome);
	}

	public void deleteById(Integer id) {
		Optional<IncomeEntity> op = incomeRepository.findById(id);
	    if (op.isPresent()) {
	        incomeRepository.deleteById(id);
	    } else {
	        throw new OurRuntimeException("Gelir tapılmadı");
	    }
		
	}

	

}
