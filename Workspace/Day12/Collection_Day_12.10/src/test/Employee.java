package test;

public class Employee {
	private int empid;
	private String name, job, joinDate, department;
	private float salary;
	public Employee() {
	}
	public Employee(int empid, String name, String job, String joinDate, float salary, String department) {
		this.empid = empid;
		this.name = name;
		this.job = job;
		this.joinDate = joinDate;
		this.salary = salary;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-15s%-15s%-15s%-10.2f", this.name, this.empid, this.joinDate, this.department, this.job, this.salary);
	}
}
