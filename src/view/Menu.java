package view;

import java.util.Scanner;

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
        System.out.println("Welcome to Absensi");
        System.out.println("==================");
        System.out.println("1. Login");
        System.out.println("2. Add New User");
        System.out.println("3. Exit");
        int option = getOption(1, 3);
        switch (option) {
            case 1:
                Login.login();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;

        }
    }
}
