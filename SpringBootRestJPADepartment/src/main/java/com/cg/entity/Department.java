package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="depattab")
public class Department {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long deptId;
	@Column(name="deptName",nullable=false)
	private String deptName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
