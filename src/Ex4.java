import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Zinssatz ein.");
        double interestRate = scanner.nextDouble();

        double balance = 1000000;

        System.out.println("Bitte geben Sie das \"Gehalt\" ein.");
        double salary = scanner.nextDouble();

        int years = 0;

        scanner.close();

        while (balance > 0) {
            balance += balance * (interestRate / 100);
            balance -= salary;
            years++;

            if (years >= 100) {
                System.out.println("Warnung. Endlosschleife, Schleife abgebrochen.");
                return;
            }
        }

        System.out.println("Bei einer jährlichen Auszahlung von " + salary + "€ und einem Zinssatz von " + interestRate + "%");
        System.out.println("würde eine Millionen Euro " + years + " Jahre ausreichen.");
    }
}
