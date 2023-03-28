package view;

import java.util.List;
import java.util.Scanner;

import database.EmployeeDatabaseManager;
import model.Employee;

public class Main {

	public Main() {
		EmployeeDatabaseManager.employeeDataGenerator();
		EmployeeDatabaseManager db = EmployeeDatabaseManager.getInstance();
		List<Employee> employees = db.getEmployeeList();
		for (Employee employee : employees) {
			System.out.println(employee.getemployeeId());
			System.out.println(employee.getPassword());
		}
		// Menu.homePage();
		Menu.mainMenu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
