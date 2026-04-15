public class ConversionPoundsAndKilograms {
    public static void main(String[]args){
        System.out.println("Kilograms   Pounds  |  Pounds   Kilograms");
        System.out.println("------------------------------------------");

        int kg = 1;
        int pound = 20;

        while(kg <= 199 && pound <= 515){

            System.out.printf("%-10d %-8.1f | %-8d %-10.2f%n",
                    kg, kilogramToPound(kg), pound, poundToKilogram(pound));
            kg+= 2;
            pound += 5;
        }
    }
    // kg → pounds
    public static double kilogramToPound(double kilogram){
        return kilogram * 2.204;
    }
    // pounds → kg
    public static double poundToKilogram(double pound){
        return pound * 0.453;
    }
}