import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //esercuzio rettangolo
double perimetroRett = perimetroRettangolo(10,7.5);
        System.out.println("il perimetro del rettangolo è? " + perimetroRett);

        //esercizio pari dispari

        //numero pari
        int pariDispari= pariDispari(10);
        System.out.println(pariDispari);
//numero dispari

        pariDispari= pariDispari(3);
        System.out.println(pariDispari);

        //Esercizio formula di Erone
        System.out.println("inserisci il primo lato del triangolo");


        double l1= scanner.nextDouble();
        System.out.println("inserisci il secondo lato del triangolo");
        double l2= scanner.nextDouble();
        System.out.println("inserisci il terzo lato del triangolo");
        double l3= scanner.nextDouble();

        double areaTr = formulaErone(l1,l2,l3);
        System.out.println("l'area del triangolo è ? "+ areaTr);

        areaTr = formulaErone(10,12,14);
        System.out.println("l'area del triangolo è ? "+ areaTr);
    }
    public static double perimetroRettangolo(double latoa , double latob){
        return ((2*latoa)+((2*latob)));

    }
    public static int pariDispari(int  a ){
        if(a% 2 == 0){
            return 0;
        }else{
            return 1;
        }

    }
    public static double formulaErone(double lato1, double lato2, double lato3){
        double semiPerimetro =( lato1 + lato2 +lato3)/2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
        return area;
    }
}
