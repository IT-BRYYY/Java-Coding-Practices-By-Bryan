import java.util.Scanner;
public class MergeTwoSortedLists {

    public static int[] merge (int[] list1, int [] list2){
        int [] result = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        while(i < list1.length && j < list2.length){
            if(list1[i] == list2[j]){
                result[k++] = list1[i++];
            }else {
                result[k++] = list2[j++];
            }
        }

        while(i < list1.length){
            result[k++] = list1[i++];
        }

        while(j< list2.length){
            result[k++] = list2[j++];
        }

        return result;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of list1: ");
        int size1 = input.nextInt();

        int [] list1 = new int[size1];
        System.out.print("Enter " + size1 + " sorted numbers for list1: ");
        for(int i = 0; i < size1; i++){
            list1[i] = input.nextInt();
        }

        System.out.print("Enter the size of list2: ");
        int size2 = input.nextInt();
        int [] list2 = new int[size2];
        System.out.print("Enter " + size2 + " sorted numbers for list2: ");
        for(int i = 0; i < size2; i++){
            list2[i] = input.nextInt();
        }

        int [] merged = merge(list1, list2);

        System.out.print("The merged list is: ");
        for(int i = 0; i < merged.length; i++){
            System.out.print(merged[i]);
            if(i < merged.length - 1) System.out.print(" ");
        }
        System.out.println();

    }

}

