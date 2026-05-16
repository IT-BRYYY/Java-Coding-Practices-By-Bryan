public class CountSingleDigits{
    public static void main(String[]args){
        int [] counts = new int[10];

        for(int i = 0; i < 200; i++){
            int digit = (int)(Math.random() * 10);
            counts[digit]++;
        }
        System.out.println("Digit\tCounts");
        for(int i = 0; i < counts.length; i++){
            System.out.println(i + "\t\t" + counts[i]);
        }
    }
}