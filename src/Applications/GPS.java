package Applications;

import java.util.Scanner;
public class GPS {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        final double RADIUS = 6371.01;

        System.out.print("Atlanta: latitude and longitude: ");
        double atlantaLat = Math.toRadians(input.nextDouble());
        double atlantaLon = Math.toRadians(input.nextDouble());

        System.out.print("Orlando: latitude and longitude: ");
        double orlandoLat = Math.toRadians(input.nextDouble());
        double orlandoLon = Math.toRadians(input.nextDouble());

        System.out.print("Savannah: latitude and longitude: ");
        double savannahLat = Math.toRadians(input.nextDouble());
        double savannahLon = Math.toRadians(input.nextDouble());

        System.out.print("Charlotte: latitude and longitude: ");
        double charlotteLat = Math.toRadians(input.nextDouble());
        double charlotteLon = Math.toRadians(input.nextDouble());

        double atlantaToOrlando = RADIUS * Math.acos(
                Math.sin(atlantaLat) * Math.sin(orlandoLat) +
                        Math.cos(atlantaLat) * Math.cos(orlandoLat) * Math.cos(atlantaLon - orlandoLon )
        );
        double orlandoToSavannah = RADIUS * Math.acos(
                Math.sin(orlandoLat) * Math.sin(savannahLat) +
                        Math.cos(orlandoLat) * Math.cos(savannahLat) * Math.cos(orlandoLon - savannahLon)
        );
        double atlantaToSavannah = RADIUS * Math.acos(
                Math.sin(atlantaLat) * Math.sin(savannahLat) +
                        Math.cos(atlantaLat) * Math.cos(savannahLat) * Math.cos(atlantaLon - savannahLon)
        );
        double savannahToCharlotte = RADIUS * Math.acos(
                Math.sin(savannahLat) * Math.sin(charlotteLat) +
                        Math.cos(savannahLat) * Math.cos(charlotteLat) * Math.cos(savannahLon - charlotteLon)
        );
        double charlotteToAtlanta = RADIUS * Math.acos(
                Math.sin(charlotteLat) * Math.sin(atlantaLat) +
                        Math.cos(charlotteLat) * Math.cos(atlantaLat) * Math.cos(charlotteLon - atlantaLon)
        );

        double s1 = (atlantaToOrlando + orlandoToSavannah + atlantaToSavannah) /2.0;
        double area1 = Math.sqrt(s1 * (s1 - atlantaToOrlando) *
                (s1 - orlandoToSavannah) * (s1 - atlantaToSavannah));

        double s2 = (atlantaToSavannah + savannahToCharlotte + charlotteToAtlanta) / 2.0;
        double area2 = Math.sqrt(s2 * (s2 - atlantaToSavannah) * (s2 - savannahToCharlotte) * (s2 - charlotteToAtlanta));

        double totalArea = area1 + area2;

        System.out.println("\nThe estimated area is: " + totalArea + " square kilometers");

        input.close();

    }
}
