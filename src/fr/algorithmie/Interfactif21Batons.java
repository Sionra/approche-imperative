package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playerLastPlay = false;
        int usrInput = 0;
        int nbBaton = 21;

        System.out.println("Bienvenu dans le jeux des 21 batons");

        do {
            do {
                System.out.println("Il y a " + nbBaton + "\nEn retirer combien entre 1 et 3");
                usrInput = input.nextInt();
            } while ((usrInput < 1 || usrInput > 3) || usrInput > nbBaton);
            nbBaton -= usrInput;
            playerLastPlay = true;
            System.out.println("vous retirer " + usrInput + " baton\nIl en reste : " + nbBaton);
            System.out.println("--------------------");

            if (nbBaton > 0) {
                switch (usrInput) {
                    case 1:
                        if (nbBaton > 3) {
                            nbBaton -= 3;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 3 baton");
                        } else if (nbBaton == 3) {
                            nbBaton -= 2;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 2 baton");
                        } else if (nbBaton == 2) {
                            nbBaton -= 1;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 1 baton");
                        } else if (nbBaton == 1) {
                            nbBaton -= 1;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 1 baton");
                        }
                        break;
                    case 2:
                        if (nbBaton > 3) {
                            nbBaton -= 2;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 3 baton");
                        } else if (nbBaton == 2) {
                            nbBaton -= 1;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 1 baton");
                        } else if (nbBaton == 1) {
                            nbBaton -= 1;
                            playerLastPlay = false;
                            System.out.println("L'ordinateur retire 1 baton");
                        }
                        break;
                    case 3:
                        nbBaton -= 1;
                        playerLastPlay = false;
                        System.out.println("L'ordinateur retire 1 baton");
                        break;
                }
                System.out.println("--------------------");
            }

        } while (nbBaton != 0);

        if (playerLastPlay){
            System.out.println("L'ordinateur Gagne");
        } else {
            System.out.println("vous avez Gagné");
        }

    }
}
