package Games;

import java.util.Scanner;

public class TypingSpeedTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] sentences = {
                "The quick brown fox jumps over the lazy dog",
                "Java is a popular programming language",
                "Practice makes perfect every single day"
        };

        int index = (int)(Math.random() * sentences.length);
        String target = sentences[index];

        System.out.println("=== Typing Speed Test ===");
        System.out.println("Type this sentence:");
        System.out.println("> " + target);
        System.out.print("\nYour input: ");

        long startTime = System.currentTimeMillis();
        String userInput = input.nextLine();
        long timeTaken = (System.currentTimeMillis() - startTime) / 1000;

        System.out.println("\n--- Results ---");

        if (userInput.equals(target)) {
            System.out.println("Perfect typing!");
        } else {
            System.out.println("Mistakes found! Expected: " + target);
        }

        System.out.println("Time   : " + timeTaken + " seconds");
        System.out.println("Words  : " + target.split(" ").length);

        input.close();
    }
}