package az.developia.balance_management.reponse;

import java.util.List;

public class IncomeListResponse {
	
	private List<IncomeResponse> incomes;

	public IncomeListResponse() {
		super();
	}

	public IncomeListResponse(List<IncomeResponse> incomes) {
		super();
		this.incomes = incomes;
	}

	public List<IncomeResponse> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<IncomeResponse> incomes) {
		this.incomes = incomes;
	}
	
}
