package OOP;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("score.txt");

        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }

        try(
                java.io. PrintWriter output = new java.io.PrintWriter(file)
        ) {
            output.print("John T. Napay");
            output.println(90);
            System.out.println("Eric K. Not");
            System.out.println(95);
        }
    }
}
