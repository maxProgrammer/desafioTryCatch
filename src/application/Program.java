package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.excepctions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int nAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account acc1 = new Account(nAccount, holder, balance, withdrawLimit);
		System.out.print("\nEnter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		try {
			acc1.withdraw(withdraw);
			System.out.printf("New balance: %.2f%n", acc1.getBalance());
		} catch (DomainException e) {
			System.err.println(e.getMessage());
		}
		sc.close();

	}

}
