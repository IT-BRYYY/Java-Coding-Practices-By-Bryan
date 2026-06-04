import java.util.Scanner;
public class SumElementsRowByRow {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double [][] m = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for(int i = 0; i < m.length;i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }
        for(int i = 0; i < m.length; i++){
            System.out.println("Sum of the elements at row " + i + " is " + sumRow(m,i));
        }
    }

    public static double sumRow(double [][]m, int rowIndex){

        double sum = 0;

        for(int j = 0; j < m[rowIndex].length; j++){
                sum += m[rowIndex][j];
        }
        return sum;
    }
}
