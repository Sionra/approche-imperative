package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val;
        System.out.println("Veuillez entrer un nombre");
        val = input.nextInt();

        for (int i = val + 1; i <= val + 10; i++) {
            System.out.print(i + ", ");
        }
    }
}
