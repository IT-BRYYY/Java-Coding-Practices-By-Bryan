import java.util.Scanner;
public class LocateTheSmallestElement {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        double [][] arr = new double[input.nextInt()][input.nextInt()];

        System.out.print("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextDouble();
            }
        }

        int []result = locateSmallest(arr);
        System.out.println("The location of the smallest element is at " + "(" + result[0] + ", " + result[1] );
    }

    public static int [] locateSmallest(double[][]a){
        int [] res = new int[2];
        double smallest = a[0][0];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < smallest){
                    smallest = a[i][j];
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;

    }
}
