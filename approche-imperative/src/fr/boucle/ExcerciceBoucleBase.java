package fr.boucle;

public class ExcerciceBoucleBase {
    public static void main(String[] args) {
        System.out.println("----- Nombre de 1 a 10 -----");
        for ( int i = 1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("\n----- 20 fois un nom -----");
        for ( int i = 0; i<20; i++){
            System.out.println("Sionra Cadish");
        }
        System.out.println("\n----- Nombre pair de 2 a 100 -----");
        for ( int i = 2; i<=100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\n----- Nombre impaire de 1 a 99 -----");
        for ( int i = 1; i<=99; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
