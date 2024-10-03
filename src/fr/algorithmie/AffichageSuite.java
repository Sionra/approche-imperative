package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        int y = 0;


        System.out.println("----- Boucle de 1 a 10 ------");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\n----- Nombre pair entre 0 et 10 -----");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n----- Nombre impair entre 1 et 9 -----");
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n----- Boucle while 1 a 10 -----");
        y = 1;
        do {
            System.out.print(y + ", ");
            y++;
        } while (y <= 10);

        System.out.println("\n----- Boucle while pair de 0 a 10 -----");
        y = 0;
        do {
            if (y % 2 == 0) {
                System.out.print(y + ", ");
            }
            y++;
        } while (y <= 10);

        System.out.println("\n----- Boucle while impair de 1 a 9 -----");
        y = 1;
        do {
            if (y % 2 == 1) {
                System.out.print(y + ", ");
            }
            y++;
        } while (y <= 9);
    }
}
