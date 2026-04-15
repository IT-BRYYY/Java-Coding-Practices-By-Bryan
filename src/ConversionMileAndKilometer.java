public class ConversionMileAndKilometer {
    public static void main(String[]args){

        System.out.println("Miles   Kilometer   |   Kilometer   Miles");
        int miles = 1;
        int kilometers = 20;

        while(miles <= 10 && kilometers <= 65){
            System.out.printf("%-10d %-8.3f | %-8d %-10.3f%n",
                    miles, milesToKilometer(miles),kilometers,kilometersToMiles(kilometers));

            miles ++;
            kilometers +=5;
        }
    }
    public static double milesToKilometer(int mile){
        return mile * 1.609;
    }
    public static double kilometersToMiles(double kilometer){
        return kilometer / 1.609;
    }
}
