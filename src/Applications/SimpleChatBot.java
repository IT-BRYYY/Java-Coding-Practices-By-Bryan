package Applications;

import java.util.*;
public class SimpleChatBot{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("You can chat with Bry's Bot (type 'bye' to quit)");
        String UserInput;

        while(true){
            System.out.print("You: ");
            UserInput = input.nextLine().toLowerCase();

            switch(UserInput){
                case "hi":
                    System.out.println("Bot: Hello!!\n ");
                    break;

                case "i have a problem":
                    System.out.println("Bot: What is that you can open up to me\n ");
                    break;

                case "goodmorning":
                    System.out.println("Bot: Goodmorning!!");
                    System.out.println("Bot: Have a Nice Day!!\n");
                    break;

                case "nvm":
                case "never mind":
                    System.out.println("Bot: ohh okay\n ");
                    break;

                case "bye":
                case "quit":
                    System.out.println("Bot: Good Byee");
                    return;

                default:
                    System.out.println("Bot: I don't understand\n ");

            }

        }

    }
}