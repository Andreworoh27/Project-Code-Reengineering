package database;

import java.util.ArrayList;
import model.Employee;

// handle CRUD and searching for employee.
public class EmployeeDatabaseManager {
    private static ArrayList<Employee> EmployeeList = new ArrayList<>();

    private static EmployeeDatabaseManager instance = null;

    public static EmployeeDatabaseManager getInstance() {
        if (instance == null) {
            synchronized (EmployeeDatabaseManager.class) {
                if (instance == null) {
                    instance = new EmployeeDatabaseManager();
                }
            }
        }
        return instance;
    }

    private EmployeeDatabaseManager() {
    }

    public ArrayList<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void addNewEmployee(Employee newEmployee) {
        EmployeeList.add(newEmployee);
    }

    public void removeEmployeeById(String id) {
        Employee deleteEmployee = searchEmployeeById(id);
        if (deleteEmployee != null) {
            EmployeeList.remove(deleteEmployee);
        }
    }

    public void updateEmployeeById(String id, Employee employee) {
        Employee updateEmployee = searchEmployeeById(id);
        // updateEmployee.set
    }

    public Employee searchEmployeeById(String id) {
        for (Employee employee : EmployeeList) {
            if (employee.getBranchId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
