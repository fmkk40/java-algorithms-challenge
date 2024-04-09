package fr.afrogeek.algorithms;

public class CalculateFactorial {
    int number;
    public CalculateFactorial(int number){
        this.number = number;
    }

  public static int CalculFac(int number){

        if (number == 1){
            return 1;
        } else{

            return number * CalculFac(number-1);
        }
  }




}
