package az.developia.balance_management.request;

public class IncomeAddRequest {
	
	private String name;
	private Double amount;
	private Integer categoryId;
	
	public IncomeAddRequest() {
		super();
	}

	public IncomeAddRequest(String name, Double amount, Integer categoryId) {
		super();
		this.name = name;
		this.amount = amount;
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
