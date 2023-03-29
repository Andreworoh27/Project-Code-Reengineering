package controller;

import database.EmployeeDatabaseManager;
import model.Employee;
import view.Login;

public class LoginController {
    private static EmployeeDatabaseManager employeeDB = EmployeeDatabaseManager.getInstance();
    private static Authentication authentication = Authentication.getInstance();

    public static boolean login(String employeeId, String password) {
        Employee employee = employeeDB.searchEmployeeById(employeeId);
        if (employee != null && (employee.getPassword().equals(password))) {
            authentication.setCurrentEmployee(employee);
            authentication.setAuthenticate(true);
        }
        return authentication.getIsAuthenticate();
    }

    public static void logout() {
        authentication.setCurrentEmployee(null);
        authentication.setAuthenticate(false);
    }
}
