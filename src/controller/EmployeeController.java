package controller;

import model.Employee;

public class EmployeeController {
    private static Authentication authentication = Authentication.getInstance();

    public EmployeeController() {
    }

    public static Employee getUser() {
        return authentication.getCurrentUser();
    }
}
