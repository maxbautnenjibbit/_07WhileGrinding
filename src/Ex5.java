import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        double costs = 1320;

        advanced();
    }

    // besser:
    public static void advanced() {
        Scanner scanner = new Scanner(System.in);

        double costsPerTicket = 1320;
        double[] validInputs = new double[]{200, 100, 50, 20, 10};

        System.out.println("Wie viele Tickets möchten Sie kaufen?");
        System.out.print("Tickets: ");
        int ticketAmount = scanner.nextInt();
        double toPay = costsPerTicket * ticketAmount;

        System.out.println("Bitte werfen Sie nun Ihre Münze hinein.");
        while (toPay > 0) {
            System.out.println("Zu Zahlen sind " + (toPay / 100) + "€");
            System.out.print("Münze: ");
            double input = scanner.nextDouble() * 100;

            if (Arrays.stream(validInputs).noneMatch(valid -> valid == input)) {
                System.out.println("Sie dürfen nur " + Arrays.stream(validInputs)
                        .mapToObj(operand -> String.valueOf(operand / 100))
                        .collect(Collectors.joining("€, ")) + "€ Münzstücke einwerfen.");
                continue;
            }

            toPay -= input;
        }

        System.out.println("Sie haben erfolgreich " + ticketAmount + " Tickets gekauft.");

        StringBuilder back = new StringBuilder();
        toPay *= -1;
        while (toPay > 0) {
            for (double validInput : validInputs) {
                if (toPay / validInput < 1)
                    continue;
                toPay -= validInput;
                back.append(validInput / 100).append("€ ");
            }
        }

        if (back.length() == 0)
            back = new StringBuilder("0€");

        System.out.println("Rückgeld: " + back);

        scanner.close();
    }
}
