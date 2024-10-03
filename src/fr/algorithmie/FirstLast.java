package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {85, 5, 24, 4, 8, 85};
        System.out.println(array.length >= 1 && (array[0] == array[array.length - 1]));
    }
}
