package com.emp.a1;

public class EmployeeDB {
	
	//creating private array access only the same class
	private Employee[] emparr;
	
	//using index for an array and increasing by using index++
	private int index=0;
	
	//using empCount to count the how many employee present in database 
	private int empCount=0;

	
	/**
	 * created constructor to initialized the size of array
	 * @param size- this is array size
	 */
	public EmployeeDB(int size) {
		emparr = new Employee[size];
	}
	
	
	/**
	 * this method is used to add employee details into the database
	 * @param e should be Employee type
	 * @return Returns true if added successfully else return false DB is full
	 */
	public boolean addEmployee(Employee e) {
		
		if(index < emparr.length) {
			emparr[index++]=e;
			System.out.println("Employee details successfully added to DB");
			empCount++;
			return true;
		}
		
		else {
			System.out.println("Database is Full");
			return false;
		}
	}
	
	/**
	 * this method prints all the details of the employees(read the data)
	 */
	public void viewFullDatabase() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("ID\tNAME\tSALARY\tEXP\tDESIGNATION\tCOMNAME");
		System.out.println("-----------------------------------------------------------");
		for (Employee emp : emparr) {
			if(emp!=null) {
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp()
			                   +"\t   "+emp.getDesignation()+"\t        "+emp.getCompname());
			}
		}
	}
	
	
	/**
	 * this method used to get total employee in database
	 * @return return int value representing total employee present in DB
	 */
	public int getEmployeeCount() {
		return empCount;
	}
	
	
	/**
	 * this method is used to search employee based on id,
	 * @param id of the employee to be searched
	 * @return return reference to found employee otherwise returns null
	 */
	public Employee searchEmployee(int id) {
		Employee e=null;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i]!=null && emparr[i].getId()==id) {
				System.out.println("Employee found in database");
				e=emparr[i];
			}
		}
		if(e==null) {
			System.out.println("Employee not found in database");
		}
		return e;
	}
	/**
	 * this method is used to update the salary of the employee.If employee is found in database
	 * it will update salary of the employee by the specified amount
	 * @param id-employee id whose salary to be updated
	 * @param amount- amount to be added to salary
	 * @return true- if update is success
	 *         false- if update is failed
	 */
	public boolean updateSalary(int id,double amount) {
		Employee e=searchEmployee(id);
		if(e!=null) {
			e.setSalary(e.getSalary()+amount);
			System.out.println("Salary updated");
			return true;
		}else {
			System.out.println("Unable to update, check your employee id");
		    return false;
		}
	}
	/**
	 * this method is used to delete employee details from database
	 * It defines the complete employee details if the record is found in database
	 * @param id of the employee to be deleted
	 * @return true-if employee is success
	 *         false-if employee is failed
	 */
	public boolean deleteEmployee(int id) {
		boolean isDeleted=false;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i]!=null && emparr[i].getId()==id) {
				System.out.println("Employee found in database and deleted");
			    emparr[i]=null;
			    isDeleted=true;
			    empCount--;
			   }
		}
		if(isDeleted==false) {
			System.out.println("Employee is not found in database");
		}
		return isDeleted;
	}
}
