package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int maxValue = -100;

        for ( int value : array){
            if (value > maxValue){
                maxValue = value;
            }
        }

        System.out.println("La plus grande valeur de l'array est : " + maxValue);
    }
}
