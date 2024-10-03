package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] secondArray = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int[] fusion = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if ( i >= secondArray.length){
                fusion[i] = array[i];
            } else {
                fusion[i] = array[i] + secondArray[i];
            }
        }

        for ( int value : fusion){
            System.out.print(value + ", ");
        }
    }
}
