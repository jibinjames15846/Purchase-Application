package com.example.jibinrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;
	private int prodctId;
	private int userId;
	private int quantity;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(int purchaseId, int quantity, int prodctId, int userId) {
		super();
		this.purchaseId = purchaseId;
		this.quantity = quantity;
		this.prodctId = prodctId;
		this.userId = userId;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProdctId() {
		return prodctId;
	}

	public void setProdctId(int prodctId) {
		this.prodctId = prodctId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
