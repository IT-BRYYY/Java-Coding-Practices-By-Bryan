import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class CaesarMD5 {

    // Mark Bryan Prieto

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String input = scanner.nextLine();

        System.out.print("Enter key: ");
        int key = scanner.nextInt();

        String caesarEncrypted = caesarCipher(input, key);
        System.out.println("Caesar Encryption: " + caesarEncrypted);

        try {
            String md5Hash = generateMD5(input);
            System.out.println("MD5 Hash: " + md5Hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error generating MD5 hash: " + e.getMessage());
        }

        scanner.close();
    }

    public static String caesarCipher(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) ((ch - base + key) % 26 + base));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String generateMD5(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashBytes = md.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}


/*

Input Text	   Key  	   Caesar Encryption	        MD5 Hash
OpenSSL      	3	          RshqVVO	        3a15f7d8f4a5f74c963f3f1a37a4c2f1
C Programming	5	       H Uwtlwfrrnsl	    ac5f1fe1773cc2b0ab758f69cdbf1c6c
123456	        4	          123456	        e10adc3949ba59abbe56e057f20f883e
HelloWorld	    2	          JgnnqYqtn         fc5e038d38a57032085441e7fe7010b0
Java123	        1	           Kbwb123        	a4a471874d4c5ecb1eb949f9c2ca3f28

*\
 */

