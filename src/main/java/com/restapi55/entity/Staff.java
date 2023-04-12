package com.restapi55.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
	@Id
	@Column(name = "staff_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staffId;
	@Column(name = "staff_name")
	private String staffName;
	@Column(name = "staff_city")
	private String staffCity;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffCity() {
		return staffCity;
	}
	public void setStaffCity(String staffCity) {
		this.staffCity = staffCity;
	}
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
