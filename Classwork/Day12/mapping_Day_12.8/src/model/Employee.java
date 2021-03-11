package model;

import annotations.Column;
import annotations.Table;

@Table(name = "employees")
public class Employee {
	
	@Column(name = "emp_name", columnDefinition = "VARCHAR(20)")
	private String name;

	@Column(name = "emp_id", columnDefinition = "INT")
	private int empId;
	@Column(name = "sal",columnDefinition = "FLOAT")
	private float salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int empId, float salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	

}

