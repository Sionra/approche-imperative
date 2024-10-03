package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val;
        int total = 0;
        System.out.println("Veuillez entrer un nombre");
        val = input.nextInt();

        for (int i = 1; i < val+1; i++) {
            total +=i;
        }

        System.out.println(total);
    }
}
