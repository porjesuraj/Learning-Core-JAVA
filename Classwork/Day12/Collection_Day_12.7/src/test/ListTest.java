package test;

import java.util.Comparator;
import java.util.List;

public class ListTest {
	private List<Employee> empList;
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void add(Employee[] arr) {
		if( this.empList != null && arr != null ) {
			for( Employee emp : arr )
				this.empList.add(emp);
		}
	}
	public Employee find(int empid) {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) {
				int index = this.empList.indexOf(key);
				return this.empList.get(index);
			}
		}
		return null;
	}
	/*public boolean remove(int empid) {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) {
				int index = this.empList.indexOf(key);
				this.empList.remove(index);
				return true;
			}
		}
		return false;
	}*/
	public boolean remove(int empid) {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) 
				return this.empList.remove(key);
		}
		return false;
	}
	public void print(Comparator<Employee> comparator) {
		if( this.empList != null ) {
			this.empList.sort(comparator);
			for (Employee emp : empList) {
				System.out.println(emp.toString());
			}
		}
	}
}
