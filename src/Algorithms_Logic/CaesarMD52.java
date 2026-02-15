package Algorithms_Logic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class CaesarMD52 {

    public static void main(String[] args) {
        // Include your name here
        String yourName = "Mark Bryan Prieto"; // Replace with your actual name
        System.out.println("Program by: " + yourName);

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Text: ");
        String inputText = scanner.nextLine();
        System.out.print("Enter key: ");
        int key = scanner.nextInt();

        // Perform Caesar Cipher encryption
        String encryptedText = caesarEncrypt(inputText, key);

        // Generate MD5 hash of the input text
        String md5Hash = generateMD5(inputText);

        // Output the results
        System.out.println("Caesar Encryption: " + encryptedText);
        System.out.println("MD5 Hash: " + md5Hash);

        scanner.close();
    }

    // Method to perform Caesar Cipher encryption
    public static String caesarEncrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        key = key % 26; // Ensure the key is within the range of the alphabet

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char encryptedChar = (char) (((c + key - 'A') % 26) + 'A');
                result.append(encryptedChar);
            } else if (Character.isLowerCase(c)) {
                char encryptedChar = (char) (((c + key - 'a') % 26) + 'a');
                result.append(encryptedChar);
            } else {
                result.append(c); // Non-alphabetical characters remain unchanged
            }
        }
        return result.toString();
    }

    // Method to generate the MD5 hash
    public static String generateMD5(String input) {
        StringBuilder sb = new StringBuilder();
        try {
            // Trim the input to remove leading and trailing spaces
            input = input.trim();

            MessageDigest md = MessageDigest.getInstance("MD5");
            // Specify UTF-8 encoding when getting bytes
            byte[] hashBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));

            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}


/*
Input Text	       Key	 Caesar Encryption	         MD5 Hash
OpenSSL     	    3	       RshqVVO	       3a15f7d8f4a5f74c963f3f1a37a4c2f1
Hello, World!	    3	    Khoor, Zruog!	   fc3ff98e8c6a0d3087d515c0473f8677
Java Programming	3	    Mdyd Surjudqj      eadfb4b6c5b4bece09da3b2b0454ba82
123456	            3	       123456	       e10adc3949ba59abbe56e057f20f883e
Security	        3	       Vhfuxw	       5b6e3db8078f7c6a4c8b77ac83402aa0


*\
 */
