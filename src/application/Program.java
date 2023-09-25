package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student info: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Media 1: ");
        double media1 = sc.nextDouble();

        System.out.print("Media 2: ");
        double media2 = sc.nextDouble();

        System.out.print("Media 3: ");
        double media3 = sc.nextDouble();




        Student student = new Student(name, media1, media2, media3);

        if (student.finalMedia() > 60) {
            System.out.println("FINAL GRADE: " + student.finalMedia());
            System.out.println("PASS");
        }
        else {
            System.out.println("FINAL GRADE:" + student.finalMedia());
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingPoints() + " points." );
        }


        sc.close();
    }
}