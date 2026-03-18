public class ShapesUsingForLoop {
    public static void main(String[]args)

    { for (int i = 1; i <= 5; i++) {

        for (int space = 5; space > i; space--)
            System.out.print(" ");
        for (int j = 1; j <= i * 2 - 1; j++)
            System.out.print("*");
        System.out.println();
    }

        for (int i = 4; i >= 1; i--) {
            for (int space = 5; space > i; space--)
                System.out.print(" ");
            for (int j = 1; j <= i * 2 - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println(" ");
        for (int i = 1; i <= 5; i++) {
            for (int space = 5; space > i; space--)
                System.out.print(" ");
            for (int j = 1; j <= i * 2 - 1; j++)
                System.out.print(i);
            System.out.println();
        }

        System.out.println(" ");


        for (int i = 1; i <= 5; i++) {
            for (int space = 5; space > i; space--)
                System.out.print(" ");
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
