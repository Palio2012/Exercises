import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me how old are you, expressed in years, months, and days: ");

        int years = sc.nextInt();
        int months = sc.nextInt();
        int days = sc.nextInt();

        int totalDays = (years * 365) + (months * 30) + (days);

        System.out.println("You have lived: " + totalDays + " days." );
    }
}