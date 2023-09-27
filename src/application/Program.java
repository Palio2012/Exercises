package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        Account account = new Account(accountNumber, holder, 0);

        System.out.print("Is there a initial value? (y/n)? ");
        char a = sc.next().charAt(0);

        if (a == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();
            account.addBalance(amount);
        }
        System.out.println("Account data: " + account);

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.addBalance(amount);

        System.out.println("Updated account data: " + account);

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdrawBalance(amount);

        System.out.println("Updated data: " + account);
    }
}
