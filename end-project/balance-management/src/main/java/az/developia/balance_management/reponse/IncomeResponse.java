package az.developia.balance_management.reponse;

import java.time.LocalDate;

public class IncomeResponse {
	
	private Integer id;
	private String name;
	private Double amount;
	private String categoryName;
	private LocalDate date;
	
	public IncomeResponse() {
		super();
	}

	public IncomeResponse(Integer id, String name, Double amount, String categoryName, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.categoryName = categoryName;
		this.date = date;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
