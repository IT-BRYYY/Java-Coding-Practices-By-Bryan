public class FutureTuition {
    public static void main(String[]args){
        double tuition = 10000;
        int years = 0;

        while(tuition <= 20000){
            tuition *= 1.07;
            years++;
        }
        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.printf("Tuition will be $%.2f in %1d", tuition, years);
    }
}
