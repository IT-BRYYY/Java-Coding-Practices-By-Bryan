package Games;

public class Swapvar {
    public static void main(String []args){

        String x = "Clean Water";
        String y = "Black Water";
        String temp;

        temp = x;
        x=y;
        y=temp;

        /*
        temp equal x, si temp ay magiging clean water kasi si x ay cleanwater
        x equal y, si x magiging si y which is black water
        y equal temp, si y magiging clean water kasi si temp ay clean water
        
        temp = x clean water
        x=y blackwater
        y=temp clean water
         */


        System.out.println("X:" + x );
        System.out.println("Y:" + y );

    }
}
