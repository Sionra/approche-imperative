package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int usrVal = 0;
        int objectif = rand.nextInt(100) + 1;
        int nbCoup = 0;

        do {
            if (nbCoup != 0){
                if (usrVal < objectif){
                    System.err.println("Plus grand");
                } else {
                    System.err.println("Plus petit");
                }
            }
            do {
                System.out.println("Veuiller entrer un nombre entre 1 et 100");
                usrVal = input.nextInt();
            } while ( usrVal < 1 || usrVal > 100);
            nbCoup++;
        } while (usrVal != objectif);

        System.out.println("Bravo, vous avez trouver en " + nbCoup + " coups");
    }
}
