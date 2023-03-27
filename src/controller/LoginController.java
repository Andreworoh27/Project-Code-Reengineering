package controller;

import database.EmployeeDatabaseManager;
import model.Employee;
import view.Login;

public class LoginController {
    private static EmployeeDatabaseManager employeeDB = EmployeeDatabaseManager.getInstance();

    public static boolean login(String employeeId, String password) {
        Employee employee = employeeDB.searchEmployeeById(employeeId);
        if (employee != null) {
            if (employee.getPassword().equals(password)) {
                employee.setAuthenticate(true);
                return employee.getAuthenticate();
            }
        }
        return employee.getAuthenticate();
    }

    public static boolean logout(String employeeId) {
        Employee employee = employeeDB.searchEmployeeById(employeeId);
        employee.setAuthenticate(false);
        return employee.getAuthenticate();
    }
}
