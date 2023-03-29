package controller;

import model.Employee;

// store current authenticate employee
public class Authentication {
    private Employee employee;

    private static Authentication instace = null;
    private static boolean isAuthenticate = false;

    public static Authentication getInstance() {
        if (instace == null) {
            synchronized (Authentication.class) {
                if (instace == null) {
                    instace = new Authentication();
                }
            }
        }
        return instace;
    }
    
    public Employee getCurrentUser() {
        return employee;
    }

    public void setCurrentEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setAuthenticate(boolean isAuthenticate) {
        Authentication.isAuthenticate = isAuthenticate;
    }

    public static boolean getIsAuthenticate() {
        return isAuthenticate;
    }
}
