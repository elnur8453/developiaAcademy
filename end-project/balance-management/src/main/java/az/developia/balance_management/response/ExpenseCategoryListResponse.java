package az.developia.balance_management.response;

import java.util.List;

public class ExpenseCategoryListResponse {
	
	private List<ExpenseCategoryResponse> expenseCategories;

	public ExpenseCategoryListResponse() {
		super();
	}

	public ExpenseCategoryListResponse(List<ExpenseCategoryResponse> expenseCategories) {
		super();
		this.expenseCategories = expenseCategories;
	}

	public List<ExpenseCategoryResponse> getExpenseCategories() {
		return expenseCategories;
	}

	public void setExpenseCategories(List<ExpenseCategoryResponse> expenseCategories) {
		this.expenseCategories = expenseCategories;
	}
	
	
}
