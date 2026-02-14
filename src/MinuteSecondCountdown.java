public class MinuteSecondCountdown {
    public static void main(String[] args) throws InterruptedException {
        int totalSeconds = 2 * 60; // 2 minutes = 120 seconds

        for (int i = totalSeconds; i >= 0; i--) {
            int minutes = i / 60;
            int seconds = i % 60;

            System.out.printf("%02d:%02d\n", minutes, seconds);
            Thread.sleep(1000); // 1 second delay
        }

        System.out.println("⏰ TIME’S UP!");
    }
}
