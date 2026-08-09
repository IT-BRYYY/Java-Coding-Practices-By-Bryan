package OOP;

public class WriteData {
    public static void main(String[]args) throws java.io.IOException{
        java.io.File file = new java.io.File("scores.txt");

        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("Hello World");
        output.println(90);
        output.println("John T. Napay");
        output.println(85);

        output.close();

    }
}
