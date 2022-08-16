package com.cg.calculatingperiod;

import java.util.Scanner;

public class ScannerDeno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.print("What is your name? ");
		String input = scanner.nextLine();
		if (input.isEmpty()) {
		break;
		}
		System.out.println("Your name is " + input +".");
		}
		scanner.close();
		System.out.println("Good bye");

	}

}
