package com.restapi55.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "City_mall")
public class CityMall {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_Quantity")
	private String productQuantity;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "fk")
	private Staff Staff;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Staff getStaff() {
		return Staff;
	}
	public void setStaff(Staff staff) {
		Staff = staff;
	}
	public CityMall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
