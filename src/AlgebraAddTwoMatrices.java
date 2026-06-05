import java.util.Scanner;
public class AlgebraAddTwoMatrices {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double [][] a = new double[2][2];
        double [][] b = new double[2][2];


        System.out.print("Matrix A: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                a[i][j] = input.nextDouble();
            }
        }

        System.out.print("Matrix B: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                b[i][j] = input.nextDouble();
            }
        }

        double[][] result = addMatrix(a, b);
        System.out.println("The matrices are added as follows");
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static double [][] addMatrix(double [][]a , double [][]b){
        double [][] total = new double[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                total[i][j] = a[i][j] + b[i][j];
            }

        }
        return total;

    }
}
