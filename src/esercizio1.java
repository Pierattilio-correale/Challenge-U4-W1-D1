import java.util.Arrays;

public class esercizio1 {
    public static void main(String[] args) {
        // esercizio moltiplicazione
        int molt = moltiplicazione(5, 2);
        System.out.println(molt);
// esercizio concat
        String concatenazione = concatena("benvenuti nel " , 2024);
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
