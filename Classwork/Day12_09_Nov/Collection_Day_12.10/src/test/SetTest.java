package test;

import java.util.Set;

public class SetTest {
	private Set<Employee> empList;
	public void setEmpList(Set<Employee> empList) {
		this.empList = empList;
	}
	public void add( Employee[] arr ) {
		if( this.empList != null && arr != null ) {
			for( Employee emp : arr )
				this.empList.add(emp);
		}
	}
	public Employee find( int empid ) {
		if( this.empList != null ) {
			for( Employee emp : this.empList ) {
				if( emp.getEmpid() == empid )
					return emp;
			}
		}
		return null;
	}
	public boolean remove( int empid ) {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) {
				this.empList.remove(key);
				return true;
			}
		}
		return false;
	}
	public void print( ) {
		if( this.empList != null ) {
			this.empList.forEach(System.out::println);
		}
	}
}
