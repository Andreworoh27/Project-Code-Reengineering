package main;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	private int getOption(int min, int max){
		int option = -1;
		do{
			System.out.println(">> ");
			try
			{
				option = scan.nextInt();
			}
			catch(Exception e)
			{
				
			}
		}while(option < min || option > max);
		return option;
	}

	private void display(){
		System.out.println("Welcome to Absensi");
		System.out.println("==================");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
	}

	public Main() {
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
