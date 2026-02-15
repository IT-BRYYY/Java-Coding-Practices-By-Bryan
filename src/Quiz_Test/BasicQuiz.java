package Quiz_Test;

import java.util.Scanner;
public class BasicQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int questionNumber = 1;

        while (questionNumber <=5){
            System.out.println("\nQuestion " + questionNumber + ":");

            switch(questionNumber){

                case 1:
                    System.out.println("Which of the following is not a Java keyword?");
                    System.out.println("1. Class");
                    System.out.println("2. interface");
                    System.out.println("3. extends");
                    System.out.println("4. implement");
                    System.out.print("Answer: ");
                    int answer1 = scanner.nextInt();

                    if (answer1 == 4){
                        System.out.println("Your answer is CORRECT!!");
                        score++;

                    }else{
                        System.out.println("INCORRECT, The Correct answer is 4");
                    }
                    break;

                case 2:
                    System.out.println("What is the size of an int data type in Java?");
                    System.out.println("1. 8 bits");
                    System.out.println("2. 16 bits");
                    System.out.println("3. 32 bits");
                    System.out.println("4. 64 bits");
                    System.out.print("Answer: ");
                    int answer2 = scanner.nextInt();

                    if (answer2 == 3){
                        System.out.println("Your answer is CORRECT!!");
                        score++;
                    }else{
                        System.out.println("INCORRECT, the correct answer is 3. 32 bits");

                    }
                    break;

                case 3:
                    System.out.println("Which method is used to find the length of a string in Java?");
                    System.out.println("1. lenght()");
                    System.out.println("2. size()");
                    System.out.println("3. getSize()");
                    System.out.println("4. getLenght()");
                    System.out.print("Answer: ");
                    int answer3 = scanner.nextInt();

                    if (answer3 == 1){
                        System.out.println("Your answer is CORRECT!!");
                        score++;
                    }else{
                        System.out.println("INCORRECT, the correct answer is 1. length()");
                    }
                    break;

                case 4:
                    System.out.println("Which of the following is used to handle exceptions in Java?");
                    System.out.println("1. try-catch");
                    System.out.println("2. if else");
                    System.out.println("3. for loop");
                    System.out.println("4. switch-case");
                    System.out.print("Answer: ");
                    int answer4 = scanner.nextInt();

                    if (answer4 == 1){
                        System.out.println("Your answer is CORRECT!!");
                        score++;
                    }else{
                        System.out.println("INCORRECT, the correct answer is 1. try-catch");
                    }
                    break;

                case 5:
                    System.out.println("Which of the following is not a primitive data type in Java?");
                    System.out.println("1. int");
                    System.out.println("2. float");
                    System.out.println("3. String");
                    System.out.println("4. boolean");
                    System.out.print("Answer: ");
                    int answer5 = scanner.nextInt();

                    if (answer5 == 3){
                        System.out.println("Your answer is CORRECT!!");
                        score++;

                    }else{
                        System.out.println("INCORRECT, the correct answer is 3. String");
                    }
                    break;

                default:
                    System.out.println("Invalid number from the choices!!");
                    break;

            }
            questionNumber++;

        }

        System.out.println("\nQuiz Complete! Your Final Score is "+ score+"/5");

        if (score == 5 ){
            System.out.println("Excellent!! ");
        }
        else if(score >= 3){
            System.out.println("Good Job!! ");
        } else{
            System.out.println("Nice Try... Better Luck NextTime");
        }

    }
}
