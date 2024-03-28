package com.emp.a1;

public class MainClass {

	public static void main(String[] args) {
		//creating object of EmployeeCreation class
		EmployeeCreation ec=new EmployeeCreation();
		Employee e1=ec.createEmployee("Dileep", 45000, 3, "ASE", "TCS");
		Employee e2=ec.createEmployee("Kinshu", 35000, 3.2, "SSE", "TCS");
		Employee e3=ec.createEmployee("Suresh", 40000, 1.5, "SE", "TCS");
		Employee e4=ec.createEmployee("Mahesh", 41000, 2.2, "SSE", "TCS");
		Employee e5=ec.createEmployee("Rupesh", 44000, 2, "ASE", "TCS");
		
		// database object creation capacity of 10
		EmployeeDB edb=new EmployeeDB(10);
		
		// calling database to store the object of Employee into the DB array with the help of
		//addEmployee() methods
		System.out.println("----------------------------------------------------------");
		edb.addEmployee(e1);
		edb.addEmployee(e2);
		edb.addEmployee(e3);
		edb.addEmployee(e4);
		edb.addEmployee(e5);
		System.out.println("-----------------------------------------------------------");
		
		//see the full details of employee
		edb.viewFullDatabase();
		System.out.println("-----------------------------------------------------------");
		
		//see the total number of employee in database
		System.out.println("Total number of Employee in DB :"+edb.getEmployeeCount());
		System.out.println("-----------------------------------------------------------");
		
		//searching the employee found in database or not
		Employee e=edb.searchEmployee(1003);
		System.out.println(e.getName()+" "+e.getDesignation());
		System.out.println("-----------------------------------------------------------");
		
		//updating the salary of one employee by passing their ID and how much amount to be increses
		edb.updateSalary(1003, 5000);
		edb.viewFullDatabase();
		System.out.println("-----------------------------------------------------------");
		
		//deleting the Employee details from database by passing their ID
		edb.deleteEmployee(1004);
		edb.viewFullDatabase();
		System.out.println("-----------------------------------------------------------");
		
		//see again after deleting the total number of employee in database
	    System.out.println("Total number of Employee in DB :"+edb.getEmployeeCount());
	    System.out.println("-----------------------------------------------------------");
		
	}

}
