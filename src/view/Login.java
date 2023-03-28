package view;

import java.util.Scanner;

import controller.Authentication;
import controller.LoginController;

public class Login {
    static Scanner scan = new Scanner(System.in);

    public static void login() {
        do {
            System.out.println("Login\n");
            System.out.println("User ID : ");
            String userId = scan.nextLine();
            System.out.println("Password : ");
            String password = scan.nextLine();
            if (!LoginController.login(userId, password)) {
                System.out.println("Invalid credentials");
            }
        } while (!Authentication.getIsAuthenticate());
    }
}
