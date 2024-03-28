package com.emp.a1;

public class EmployeeCreation {

	private static int randum=1001;
	/**
	 * this method return type is object type we create object of Employee class and generating randum id
	 * @param name
	 * @param salary
	 * @param exp
	 * @param designation
	 * @param compname
	 * @return object reference
	 */
	
	public Employee createEmployee(String name, double salary, double exp,
			                         String designation, String compname) {
		Employee e1=new Employee(randum++, name, salary, exp, designation, compname);
		return e1;
	}
}
