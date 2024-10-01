public class ExcerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("----- Valeur de l'array -----");
        for ( int value : array){
            System.out.println(value);
        }

        System.out.println("------ Valeur de l'array inversé -----");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

        System.out.println("----- Valeur de l'array supérieur a 3 -----");
        for ( int value : array){
            if ( value > 3){
                System.out.println(value);
            }
        }

        System.out.println("----- Valeur de l'array pair -----");
        for ( int value : array){
            if ( value % 2 == 0){
                System.out.println(value);
            }
        }

        System.out.println("----- Valeur de l'array a des index pair");
        for ( int i = 0; i<array.length; i++){
            if (i%2 == 0){
                System.out.println(array[i]);
            }
        }

        System.out.println("----- Valeur de l'array impair -----");
        for ( int value : array){
            if ( value % 2 == 1){
                System.out.println(value);
            }
        }
    }
}
