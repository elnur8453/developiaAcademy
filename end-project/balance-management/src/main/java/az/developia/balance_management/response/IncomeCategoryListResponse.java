package az.developia.balance_management.response;

import java.util.List;

public class IncomeCategoryListResponse {
	
	private List<IncomeCategoryResponse> incomeCategories;

	public IncomeCategoryListResponse() {
		super();
	}

	public IncomeCategoryListResponse(List<IncomeCategoryResponse> incomeCategories) {
		super();
		this.incomeCategories = incomeCategories;
	}

	public List<IncomeCategoryResponse> getIncomeCategories() {
		return incomeCategories;
	}

	public void setIncomeCategories(List<IncomeCategoryResponse> incomeCategories) {
		this.incomeCategories = incomeCategories;
	}
	
}
