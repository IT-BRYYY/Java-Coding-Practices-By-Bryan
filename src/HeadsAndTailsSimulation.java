public class HeadsAndTailsSimulation {
    public static void main(String[] args) {
        int tails = 0;
        int heads = 0;

        for(int i = 1; i <= 2000000; i++) {
            int random = (int) (Math.random() * 2);
            if(random == 0){
                tails += 1;
            }else {
                heads += 1;
            }
        }
        System.out.println("Tails: " + tails);
        System.out.println("Heads: " + heads);
    }
}
