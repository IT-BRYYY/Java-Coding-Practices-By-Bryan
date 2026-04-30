public class RandomCharacter {
    public static char getRandomLowerCaseLetter() {
        return (char) ('a' + (int)(Math.random() * 26));
    }

    public static char getRandomUpperCaseLetter() {
        return (char) ('A' + (int)(Math.random() * 26));
    }

    public static char getRandomDigitCharacter() {
        return (char) ('0' + (int)(Math.random() * 10));
    }

    public static char getRandomCharacter() {
        return (char) (32 + (int)(Math.random() * 95));
    }
}