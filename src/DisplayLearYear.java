public class DisplayLearYear {
    public static void main(String[]args){
        int year = 2014;
        int count = 0;

        for(int j = year; j <= 2114; j++){
            boolean isLeapYear = (j % 4 == 0 && j % 100 != 0 || (j % 400 == 0));

            if(isLeapYear){
                System.out.printf("%-5d", j);
                count += 1;

                if(count % 10 == 0){
                    System.out.println();
                }
            }

        }
        System.out.println("\nTotal leap years: " + count);
    }
}
