package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int somme = 0;

        for (int value : array) {
            somme += value;
        }

        System.out.println("La moyenne des elements du tableau est : " + (double)somme / array.length);
    }
}
