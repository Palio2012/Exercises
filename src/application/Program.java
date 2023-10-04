package application;


import model.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Maria", "maria@gmail.com", 3200.00));
        list.add(new Employee("Alex", "alex@gmail.com", 1900.00));
        list.add(new Employee("Marco", "marco@gmail.com", 1700.00));
        list.add(new Employee("Bob", "bob@gmail.com", 3500.00));
        list.add(new Employee("Ana", "ana@gmail.com", 2800.00));

        System.out.print("Enter salary: ");
        double salaryCriteria = sc.nextDouble();

        list.stream().filter(x -> x.getSalary() > salaryCriteria).collect(Collectors.toList()).forEach(System.out :: println);

        List <Double> list2 = Collections.singletonList(list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x, y) -> x + y));

        list2.forEach(System.out :: println);


        sc.close();
    }
}
