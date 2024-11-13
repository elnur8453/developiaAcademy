package az.developia.balance_management.request;

public class IncomeCategoryAddRequest {
	
	private String name;
	
	public IncomeCategoryAddRequest() {
		super();
	}

	public IncomeCategoryAddRequest(String name) {
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
