import java.util.Arrays;
import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // esercizio moltiplicazione

        System.out.println("inserisci primo operando");
        int on1= scanner.nextInt();

        System.out.println("inserisci il secondo operando");
        int on2= scanner.nextInt();
        scanner.nextLine();
        int molt = moltiplicazione(on1, on2);
        System.out.println(molt);


// esercizio concat
        System.out.println("inserisci la stringa ");
        String on3 = scanner.nextLine() + " ";
        System.out.println("inserisci l'intero");
        int on4 = scanner.nextInt();
        scanner.nextLine();

        String concatenazione = concatena(on3 , on4);
        System.out.println(concatenazione);

    //  esercizio array
        String[] array = {"a", "b", "c", "d", "e"};
        String[] risultato = inserisciInArray(array, "terzoposto");
        System.out.println(Arrays.toString(risultato));

    }
    public static int moltiplicazione(int a , int b){
        return a*b;
    }
    public static String concatena(String a , int b){
        return a + b;
    }
    public static String[] inserisciInArray(String[] array, String b) {
        // Creazione del nuovo array di 6 elementi
        String[] nuovoArray = new String[6];

        // Copia manuale dei primi 3 elementi
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = array[2];

        // Inserimento della nuova stringa al terzo posto (indice 3)
        nuovoArray[3] = b;

        // Copia manuale degli ultimi 2 elementi
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }
//    public static String[] inserisciInArray(String[] array,   String b){
//        String[] nuovoArray = new String[6];
//        System.arraycopy(array, 0, nuovoArray, 0, 3);
//
//
//        nuovoArray[3] = b;
//
//
//        System.arraycopy(array, 3, nuovoArray, 4, 2);
//
//        return nuovoArray;
//    }
}
