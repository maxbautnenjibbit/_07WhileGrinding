import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double sum = 0;
        double max = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("# Einkaufsrechner");

        while (sum < max) {
            System.out.println("Sie haben bereits " + sum + "€ / " + max + "€ erreicht.");
            System.out.print("Bitte geben Sie einen weiteren Betrag ein: ");

            double input = scanner.nextDouble();
            double newSum = sum + input;

            if (newSum > max) {
                System.out.println("Sie haben eine Summe von " + newSum + "€, Sie dürfen aber maximal");
                System.out.println(max + "€ auf Ihrer Einkaufliste haben. Bitte geben Sie einen neuen Betrag ein.");
            } else {
                sum = newSum;
            }
        }

        scanner.close();

        System.out.println("Der Gesamtpreis beträgt: " + sum + " Euro. Sie haben Ihr Limit erreicht.");
    }
}
