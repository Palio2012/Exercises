package application;


import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

   public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c) ?");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();


            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health Expenditires: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));

            }
            else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double sum = 0;
        for (TaxPayer taxPayer : list) {
            sum += taxPayer.tax();
        }

        System.out.println("TAXES PAID: ");

        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
        }

        System.out.printf("TOTAL TAXES: %.2f", sum);

        sc.close();
    }
}
