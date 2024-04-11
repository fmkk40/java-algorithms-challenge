package fr.afrogeek.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class findLargestNumber {

    ArrayList<Integer> tableau;

    public findLargestNumber() {
        Scanner klavier = new Scanner(System.in);
        tableau = new ArrayList<>();
        System.out.println("Entrez les éléments du tableau (entrez 'fin' pour terminer) :");

        while (true) {
            String input = klavier.nextLine();
            if (input.equals("fin")) {
                break;
            }

            try {
                int element = Integer.parseInt(input);
                tableau.add(element);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre entier valide ou 'fin' pour terminer.");
            }
        }

        klavier.close();
    }

    public int fintNumber() {
        if (tableau.isEmpty()) {
            throw new IllegalStateException("Le tableau est vide");
        }

        int Max = tableau.get(0);
        for (int i = 1 ; i < tableau.size() ; i++){
            if ( Max < tableau.get(i)){
                Max = tableau.get(i);
            }
        }
        return Max;


    }

}












