package com.corejavaexa;

public class Employee implements Comparable<Employee>
{
	private int emp_id;
	private String emp_name;
	private String emp_mobile;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_mobile() {
		return emp_mobile;
	}
	public void setEmp_mobile(String emp_mobile) {
		this.emp_mobile = emp_mobile;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_mobile=" + emp_mobile + "]";
	}
	public Employee(int emp_id, String emp_name, String emp_mobile) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_mobile = emp_mobile;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
