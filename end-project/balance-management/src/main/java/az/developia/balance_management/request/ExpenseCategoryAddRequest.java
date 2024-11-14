package az.developia.balance_management.request;

public class ExpenseCategoryAddRequest {
	
    private String name;

	public ExpenseCategoryAddRequest() {
		super();
	}

	public ExpenseCategoryAddRequest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
