import java.util.Random;
public class RandomSelector {

    public static void main(String[]args){
        System.out.println(getRandom(3, 1, 7, 4, 9));

        System.out.println(getRandom(100, 200));

        System.out.println(getRandom(42));
    }

    public static int getRandom(int... numbers){
        Random rand = new Random();
        int index = rand.nextInt(numbers.length);
        return numbers[index];
    }
}
