package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean firstTime = true;
        int val;
        do {
            if (!firstTime) {
                System.err.println("ERREUR");
            }
            System.out.println("Veuillez entrer un nombre entre 1 et 10");
            val = input.nextInt();
            firstTime = false;
        } while (val < 1 || val > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(val + " * " + i + " = " + val * i);
        }
    }
}
