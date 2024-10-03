package fr.algorithmie;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usrInput;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        System.out.println("Choisissez un rang pour la suite de Fibonacci");
        usrInput = input.nextInt();

        for (int i = 2; i < usrInput; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        System.out.println("Le nombre a la valeur " + usrInput + " de la suite de fibonacci et :\n" + fibonacci.getLast());
    }
}
