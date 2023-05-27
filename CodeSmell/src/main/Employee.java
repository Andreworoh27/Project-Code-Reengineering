package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	public static Employee currentEmployee;
	private static boolean isAuthenticate = false;
	private static ArrayList<Employee> EmployeeList = new ArrayList<>();
	
	private String employeeId = "";
    private String name = "";
    private String telephone = "";
    private String address = "";
    private String password = "";
    private int salaryPerHour;
    
    static Scanner scan = new Scanner(System.in);
    
    public static void login() {
    	do {
            System.out.println("Login\n");
            System.out.println("User ID : ");
            String userId = scan.nextLine();
            System.out.println("Password : ");
            String password = scan.nextLine();
            if (!login(userId, password)) {
                System.out.println("Invalid credentials");
            }
        } while (!isAuthenticate());
    }
    
    public static boolean login(String employeeId, String password) {
        Employee employee = searchEmployeeById(employeeId);
        if (employee != null && (employee.getPassword().equals(password))) {
            setCurrentEmployee(employee);
            setAuthenticate(true);
        }
        return isAuthenticate();
    }

    public static void logout() {
        setCurrentEmployee(null);
        setAuthenticate(false);
    }
    
	public static Employee getCurrentEmployee() {
		return currentEmployee;
	}

	public static void setCurrentEmployee(Employee currentEmployee) {
		Employee.currentEmployee = currentEmployee;
	}

	public static boolean isAuthenticate() {
		return isAuthenticate;
	}

	public static void setAuthenticate(boolean isAuthenticate) {
		Employee.isAuthenticate = isAuthenticate;
	}
	
	public static void addNewEmployee(Employee newEmployee) {
        EmployeeList.add(newEmployee);
    }

    public static void removeEmployeeById(String id) {
        Employee deleteEmployee = searchEmployeeById(id);
        if (deleteEmployee != null) {
            EmployeeList.remove(deleteEmployee);
        }
    }

    public static void updateEmployeeById(String id, Employee employee) {
        Employee updateEmployee = searchEmployeeById(id);
        // updateEmployee.set
    }

    public static Employee searchEmployeeById(String id) {
        for (Employee employee : EmployeeList) {
            if (employee.getEmployeeId().equalsIgnoreCase(id)) {
                return employee;
            }
        }
        return null;
    }

    public static void employeeDataGenerator() {
        Employee employee = new Employee("EP001", "orang 1", "0812345678", "Di rumah", 50, "test");
        addNewEmployee(employee);
    }

    
    
	public Employee(String employeeId, String name, String telephone, String address, int salaryPerHour, String password) {
		this.employeeId = employeeId;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.salaryPerHour = salaryPerHour;
        this.password = password;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}
	
	public int getMaxSalary(ArrayList<Integer> salaries) {
		int max = 0;
		for(Integer i : salaries) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	
}
