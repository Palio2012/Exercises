import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  K, Re, Ra, F;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the temperature in ºC:");
        double C = sc.nextDouble();

        K = C + 273.15;
        F = C*1.8+32;
        Re = C*0.8;
        Ra = C*1.8 + 32 +459.67;

        System.out.println("Fahrenheit: " + F);
        System.out.println("Kelvin: " + K);
        System.out.println("Rankine: " + Ra);
        System.out.println("Réamur: " + Re);

    }
}
