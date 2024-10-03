package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int nbcommun = 0;

        for (int value : array1){
            for (int secondValue : array2){
                if (value == secondValue){
                    nbcommun++;
                }
            }
        }

        System.out.println("Nombre de nombre commun enter les 2 array : " + nbcommun);
    }
}
