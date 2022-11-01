import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int amount = 0;

        Scanner scanner = new Scanner(System.in);

        while (sum < max) {
            System.out.print("Bitte geben Sie eine weitere Zahl ein: ");

            int eingabe = scanner.nextInt();

            sum = sum + eingabe;
            amount++;
        }

        scanner.close();

        System.out.println("Addierte Zahlen: " + amount + " Ergebnis: " + sum + " Maximal erlaubt: " + max);
    }
}
