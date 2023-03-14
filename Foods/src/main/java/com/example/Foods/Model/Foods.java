package com.example.Foods.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Foods {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String category;
	private String variety;
	private String dish;
	private int price;
	
	public Foods(Integer id,String category, String variety, String dish, int price) {
		super();
		this.id=id;
		this.category = category;
		this.variety = variety;
		this.dish = dish;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Foods [id=" + id + ",category=" + category + ", variety=" + variety + ", dish=" + dish + ", price=" + price + "]";
	}
}
