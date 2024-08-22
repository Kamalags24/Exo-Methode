package Pyramide;

import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de lignes pour la pyramide: ");
        int rows = scanner.nextInt();
        scanner.close();

        // for (int i = 1; i < rows; i++) {
        //     // Imprimer les espaces
        //     for (int j = rows - i; j > 0; j--) {
        //         System.out.println(" ");
        //     }

        //     //Imprimer les étoiles 
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.println("*");
        //     }

        //     //Nouvelle ligne après chaque ligne de la pyramide 
        //     System.out.println();
        // }


        for (int i = 1; i < rows; i++) {
            //Iprimer les étoiles pour chaque ligne 
            for (int j = 1; j <= i; j++) {
                System.out.println("* ");
            }

            //Passer à la ligne suivante après chaque ligne d'étoiles
            System.out.println();
        }
    }
}
