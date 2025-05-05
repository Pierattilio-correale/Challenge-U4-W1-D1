import java.util.Scanner;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = metodoMain(scanner);

        System.out.println("Stringa normale: " + parola);

        // Inversione dell'ordine delle parole
        String[] parole = parola.split(" ");
        String parolaInvertita = parole[2] + " " + parole[1] + " " + parole[0];
        System.out.println("Stringa con ordine invertito: " + parolaInvertita);
    }

    public static String metodoMain(Scanner scanner) {
        String a, b, c;

        System.out.println("Inserisci la prima parola:");
        a = scanner.nextLine();
        System.out.println("Inserisci la seconda parola:");
        b = scanner.nextLine();
        System.out.println("Inserisci la terza parola:");
        c = scanner.nextLine();

        return a + " " + b + " " + c;
    }
}
