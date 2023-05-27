package main;

import java.util.Scanner;


public class Main {

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
                    Employee.login();
                    if (Employee.isAuthenticate()) { // user authenticated
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
        } while (Employee.isAuthenticate());
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
                    switch (Attendance.attend()) {
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
                	Employee employee = Employee.getCurrentEmployee();
                    System.out.println("Your account information : ");
                    System.out.println("Employee ID : " + employee.getEmployeeId());
                    System.out.println("Employee Name : " + employee.getName());
                    System.out.println("Employee Address : " + employee.getAddress());
                    System.out.println("Employee Phone Number : " + employee.getTelephone());
                    System.out.println("Employee Salary Per Hour : " + employee.getSalaryPerHour());
                    break;
                case 3:
                    Employee.logout();
                    return;
                default:
                    System.out.println("Invalid input");
                    break;

            }
        } while (true);
    }
	public Main() {
//		mainMenu();
		homePage();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
