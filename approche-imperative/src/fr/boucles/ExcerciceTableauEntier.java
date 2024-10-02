package fr.boucles;

public class ExcerciceTableauEntier {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Premier elements du tableau : " + array[0]);
        System.out.println("Taille du tableau : " + array.length);
        System.out.println("Dernier elements du tableau : " + array[array.length - 1]);
        array[4] = 8;
    }
}
