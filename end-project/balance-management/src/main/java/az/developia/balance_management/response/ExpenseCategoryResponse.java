package az.developia.balance_management.response;

public class ExpenseCategoryResponse {
	
	private Integer id;
	private String name;
	
	public ExpenseCategoryResponse() {
		super();
	}

	public ExpenseCategoryResponse(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
