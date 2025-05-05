public class Esercizio3 {
    public static void main(String[] args) {
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
        double areaTr = formulaErone(7,8,9);
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
