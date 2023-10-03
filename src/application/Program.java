package application;


import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

   public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data: ");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            sc.next();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter the amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.print("New balance: " + account.getBalance());
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
