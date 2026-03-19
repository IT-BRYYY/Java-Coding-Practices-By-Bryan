public class PracticingForLoop {
    public static void main (String[]args){


        for(int i = 0, j = 10; i <=10 && j >=0; i++, j-- ){
            System.out.println(i + " + " + j + " = " + (j + i));
        }

        for(int i = 1; i <100; i++) {
            for (int q = 1; q <= 100; q++) {
                char random = (char) ('A' + (int) (Math.random() * 26));
                System.out.print(random);

            }
            System.out.println();
        }
    }
}
