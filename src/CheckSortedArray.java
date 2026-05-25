import java.util.Scanner;
public class CheckSortedArray {
    public static boolean isSorted(int[] list){
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i + 1]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int size = input.nextInt();

        int [] list = new int[size];
        for(int i = 0; i < size; i++){
            list [i] = input.nextInt();
        }

        if(isSorted(list)){
            System.out.println("Sorted array");
        }else{
            System.out.println("Not sorted array");
        }
    }
}
