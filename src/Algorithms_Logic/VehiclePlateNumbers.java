package Algorithms_Logic;

public class VehiclePlateNumbers {
    public static void main(String[]args){

        String plateNumber1 = "";
        String plateNumber2 = "";

        for(int i = 0; i < 3; i++){
            char randomUpperCaseLetter = (char)((int)(Math.random() * 26) + 'A');
            plateNumber1 += randomUpperCaseLetter;
        }for(int i = 0; i < 4; i++){
            int randomNumbers = ((int)(Math.random() * 10));
            plateNumber2 += randomNumbers;
        }
        System.out.println("Your plate number is " + plateNumber1 + plateNumber2);
    }
}
