import java.util.Scanner;
public class Leaderboard {
    public static void selectionSort(int [] scores, String[] names){
        for(int i = 0; i < scores.length; i++){
            int currentMaxIndex = i;

            for(int j = i + 1; j < scores.length; j++){
                if(scores [j] > scores[currentMaxIndex]){
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex != i){

                int tempScore = scores[currentMaxIndex];
                scores[currentMaxIndex] = scores[i];
                scores[i] = tempScore;

                String tempName = names[currentMaxIndex];
                names[currentMaxIndex] = names[i];
                names [i] = tempName;

            }
        }

    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many players? ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];
        int [] scores = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter player name: ");
            names[i] = input.nextLine();
            System.out.print("Enter score: ");
            scores[i] = input.nextInt();
            input.nextLine();
        }

        selectionSort(scores,names);

        System.out.println("\n--- LEADERBOARD ---");
        for(int i = 0; i < names.length; i++){
            System.out.println("Rank " + (i + 1) + ": " + names[i] + " - " + scores[i] + " pts");
        }

        System.out.println("\nChampion: " + names[0] + " with " + scores[0] + " pts!");

    }
}
