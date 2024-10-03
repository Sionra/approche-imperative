package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val;
        int plusGrand = 0;
        boolean fistTime = true;
        for (int i = 0; i < 10; i++) {
            System.out.println("Veuillez entrer un nombre");
            val = input.nextInt();

            if (val > plusGrand && !fistTime) {
                plusGrand = val;
            } else if ( fistTime ){
                plusGrand = val;
                fistTime = false;
            }
        }

        System.out.println("Le nombre entrée le plus grand est : " + plusGrand);
    }
}
