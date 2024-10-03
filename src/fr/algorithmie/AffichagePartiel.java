package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("----- Entier superieur a 3 -----");
        for (int value : array) {
            if (value > 3){
                System.out.print(value + ", ");
            }
        }

        System.out.println("\n----- Nombre pair -----");
        for (int value : array) {
            if (value % 2 == 0){
                System.out.print(value + ", ");
            }
        }

        System.out.println("\n----- Nombre au index pair -----");
        for (int i = 0; i < array.length; i++) {
            if ( i % 2 == 0){
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("\n----- Nombre impair -----");
        for ( int value : array ){
            if (value % 2 != 0){
                System.out.print(value + ", ");
            }
        }
    }
}
