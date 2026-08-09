package OOP;
import java.io.*;

public class CrashPreventerDemo {
    public static void main(String[] args){
        PrintWriter writer = null;

        try {
            writer = new PrintWriter("scores.txt");

            writer.println("Student: john");
            writer.println("Score: 85");
            writer.println("Subject:");

            writer.println("Data written successfully");

            if(true){
                throw new IOException("Disk is full");
            }
            writer.println("This data is lost!");
        }
        catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Program had a problem, but we're recovering...");
        }
        finally {
            System.out.println("Cleaning up resources...");
            if(writer != null){
                writer.close();
                System.out.println("File closed successfully");
            }else{
                System.out.println("No file to close.");
            }
        }
        System.out.println("Program continues normally");
    }
}
