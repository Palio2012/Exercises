package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.diagonal();

        System.out.printf("AREA: %.4f%n", area);
        System.out.printf("PERIMETER: %.4f%n", perimeter);
        System.out.printf("DIAGONAL: %.4f%n", diagonal);

    }
}