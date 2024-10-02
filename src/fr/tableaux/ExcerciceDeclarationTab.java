package fr.tableaux;

public class ExcerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tableau = new int[8];
        tableau[0] = 8;
        tableau[1] = -7;
        tableau[2] = 12;
        tableau[3] = 1;
        tableau[4] = -2;
        tableau[5] = 14;
        tableau[6] = 17;
        tableau[7] = 9;

        System.out.println("Valeur a l'index 0 du tableau : " + tableau[0]);
        System.out.println("Longeur du tableau : " + tableau.length);
        System.out.println("Dernière valeur du tableau : " + tableau[tableau.length-1]);

        // Il y auras une erreur 'OutOfBoud Exception car nous sortons du tableau
        System.out.println("Valeur a l'index 10 du tableau : " + tableau[10]);

    }
}
