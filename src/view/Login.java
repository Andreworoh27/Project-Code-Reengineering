package view;

import java.util.Scanner;

import controller.LoginController;

public class Login {
    static Scanner scan = new Scanner(System.in);
    public static void login(){
        System.out.println("Login\n\n");
        System.out.println("User ID : ");
        String userId = scan.nextLine();
        System.out.println("Password : ");
        String password = scan.nextLine();
        if(!LoginController.login(userId, password)){
            System.out.println("User does not exist\n");
        }

    }
}
