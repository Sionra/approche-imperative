package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 4, 8, 6};
        System.out.println(array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6));
    }
}
