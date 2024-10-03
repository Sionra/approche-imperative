package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        //Copy de array mais dans le sens inverse
        for (int i = array.length - 1; i >= 0; i--) {
            arrayCopy[array.length - 1 - i] = array[i];
        }

        System.out.println("----- Array dans l'ordre inverse -----");
        for (int value : arrayCopy) {
            System.out.print(value + ", ");
        }
        System.out.println("\n----- Array dans l'ordre -----");
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
}
