package Applications;

import java.util.*;
public class FuturePopulation{
    public static void main(String [] args){

        final long CURRENT_POPULATION = 312032486;
        final long SECONDS_PER_YEAR = 365 * 24 * 60 *60;

        double birthsPerYear = (double)SECONDS_PER_YEAR / 7;
        double deathsPerYear = (double)SECONDS_PER_YEAR / 13;
        double immigrantsPerYear = (double)SECONDS_PER_YEAR / 45;

        double netIncreasePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of year: ");
        int years = input.nextInt();

        double futurePopulation = CURRENT_POPULATION + (netIncreasePerYear * (long)years);
        long roundedPopulation = (long) Math.floor(futurePopulation);

        System.out.println("The population in " + years + " years is " + roundedPopulation);






    }
}