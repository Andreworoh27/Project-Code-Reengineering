package view;

import java.lang.StackWalker.Option;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import controller.AttendanceController;
import controller.Authentication;
import controller.EmployeeController;
import controller.LoginController;
import model.Employee;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    private static int getOption(int min, int max) {
        int option = -1;
        do {
            System.out.println(">> ");
            try {
                option = scan.nextInt();
            } catch (Exception e) {

            }
        } while (option < min || option > max);
        return option;
    }

    public static void homePage() {
        do {
            System.out.println("Welcome to Absensi");
            System.out.println("==================");
            System.out.println("1. Login");
            System.out.println("2. Add New User");
            System.out.println("3. Exit");
            int option = getOption(1, 3);
            switch (option) {
                case 1:
                    Login.login();
                    if (Authentication.getIsAuthenticate()) {
                        mainMenu();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    break;

            }
        } while (!Authentication.getIsAuthenticate());
    }

    public static void showUserInformation() {
        Employee employee = EmployeeController.getUser();
        System.out.println("Your account information : ");
        System.out.println("Employee ID : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Employee Address : " + employee.getAddress());
        System.out.println("Employee Phone Number : " + employee.getTelephone());
        System.out.println("Employee Salary Per Hour : " + employee.getSalaryPerHour());
    }

    public static void mainMenu() {
        do {
            System.out.println("Main menu : ");
            System.out.println("1. Attend");
            System.out.println("2. Get User Info");
            System.out.println("3. Logout");
            int option = getOption(1, 3);
            switch (option) {
                case 1:
                    switch (AttendanceController.attend()) {
                        case 0:
                            System.out.println("Clock in success");
                            break;
                        case 1:
                            System.out.println("Clock out success");
                            break;
                        default:
                            System.out.println("Already clock in and clock out");
                            break;
                    }
                    break;
                case 2:
                    showUserInformation();
                    break;
                case 3:
                    LoginController.logout();
                    return;
                default:
                    System.out.println("Invalid input");
                    break;

            }
        } while (true);
    }
}
