package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int employees = sc.nextInt();

        for (int x = 0; x < employees; x++) {
            System.out.println("Employee #" + (x + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        Integer pos = position(list, idIncrease);

        if (pos == null) {

            System.out.println("This id does not exist!");

        } else {

            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            list.get(pos).increaseSalary(percentage);
        }
        System.out.println("List of employees: ");
        list.forEach(System.out :: println);

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
