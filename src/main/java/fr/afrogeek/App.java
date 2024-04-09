package fr.afrogeek;

import fr.afrogeek.algorithms.CalculateFactorial;

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
        System.out.println("Geben Sie eine Zahl ein");
        int number = klavier.nextInt();

        CalculateFactorial factorial = new CalculateFactorial(number);

        System.out.println(factorial.CalculFac(number));





    }
}
