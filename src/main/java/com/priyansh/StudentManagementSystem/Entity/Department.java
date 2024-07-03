package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Department {

	@Id
	private int Dept_id;
	private String name;
	private String HOD;
	

	public int getDept_id() {
		return Dept_id;
	}


	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHOD() {
		return HOD;
	}


	public void setHOD(String hOD) {
		HOD = hOD;
	}
	



	@Override
	public String toString() {
		return "Department [name=" + name + ", HOD=" + HOD + "]";
	}


	public Department() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
}
