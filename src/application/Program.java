package application;

import entities.Student;
import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What's the dollar price? : ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarAmount = sc.nextDouble();

        System.out.println("Amount to be paid in reais: " + currencyConverter.toReal(dollarPrice, dollarAmount));

        sc.close();


    }
}
