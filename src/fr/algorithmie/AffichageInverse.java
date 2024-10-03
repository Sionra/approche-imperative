package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy;

        System.out.println("----- Valeur de l'array dans le sens ordonée");
        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("----- Valeur de l'array dans le sens désordonée");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //Copie du tableau ans un autre tableau
        arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
    }
}
