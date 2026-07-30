package OOP;
import java.util.*;
public class ListMethodsExample {
    public static void main(String[]args){
        Integer [] array = {3, 5, 95,4, 15, 34, 3,6,5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        Integer[] array2 = new Integer[list.size()];
        list.toArray(array2);
        System.out.println("Array: " + Arrays.toString(array2));
    }
}
