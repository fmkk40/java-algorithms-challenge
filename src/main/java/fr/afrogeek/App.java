package fr.afrogeek;


import fr.afrogeek.algorithms.Addition;
import fr.afrogeek.algorithms.Subtraction;
import fr.afrogeek.algorithms.isPrime;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner klavier = new Scanner(System.in);
        System.out.println("ENTRE UN NOMBRE");
         int number = klavier.nextInt();


        isPrime primeChecker = new isPrime(number);

        if (primeChecker.isPrime()) {
            System.out.println(number + " est un nombre premier.");
        } else {
            System.out.println(number + " n'est pas un nombre premier.");
        }
    }

}
