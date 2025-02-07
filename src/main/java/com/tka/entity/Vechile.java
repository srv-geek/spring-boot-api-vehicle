package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vechile {

	@Id
	private String vechile_no;
	private String model;
	private String maker;
	private String type;
	private long price;

	public Vechile() {

	}

	public Vechile(String vechile_no, String model, String maker, String type, long price) {
		super();
		this.vechile_no = vechile_no;
		this.model = model;
		this.maker = maker;
		this.type = type;
		this.price = price;
	}

	public String getVechile_no() {
		return vechile_no;
	}

	public void setVechile_no(String vechile_no) {
		this.vechile_no = vechile_no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vechile [vechile_no=" + vechile_no + ", model=" + model + ", maker=" + maker + ", type=" + type
				+ ", price=" + price + "]";
	}

}
