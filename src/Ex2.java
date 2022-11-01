import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double voltage = 0;
        double min = 14.9;
        double max = 15.1;

        Scanner scanner = new Scanner(System.in);
        while (voltage < min || voltage > max) {
            System.out.print("Spannungswert: ");
            voltage = scanner.nextDouble();

            if (voltage < min) {
                System.out.println("Der Spannungswert ist zu klein. Bitte versuchen Sie es erneut.");
            } else if (voltage > max) {
                System.out.println("Der Spannungswert ist zu groß. Bitte versuchen Sie es erneut.");
            }
        }
        scanner.close();

        System.out.println("Spannungswert (" + voltage + "V) ist im grünen Bereich!");
    }
}
