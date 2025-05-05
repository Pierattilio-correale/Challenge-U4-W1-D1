import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = metodoMain(scanner);
        System.out.println(parola);

    }
    public static String metodoMain (Scanner scanner){
        String a ;
        String b ;
        String c;

        System.out.println("inserisci la prima parola");
        a = scanner.nextLine(); ;
        System.out.println("inserisci la seconda parola");
        b = scanner.nextLine();
        System.out.println("inserisci la terza parola");
        c= scanner.nextLine();
        return a + " " +b +" "+ c;

    }
}
