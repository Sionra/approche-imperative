package fr.algorithmie;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usrInputMenu = 0;
        ArrayList<Integer> usrArray = new ArrayList<Integer>();

        do {
            System.out.println("Quel action voulez-vous faire ?");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existant");
            System.out.println("Any. Quitter");

            usrInputMenu = input.nextInt();
            switch (usrInputMenu) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Veuillez entrer le nombre a ajouter");
                    usrArray.add(input.nextInt());
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Voici la liste des numero deja entrer");
                    System.out.println(usrArray.toString());
                    System.out.println("-------------------------");
                    break;
            }

        } while (usrInputMenu < 3 && usrInputMenu > 0);
        System.out.println("-------------------------");
        System.out.println("Au revoir");
    }
}
