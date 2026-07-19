package OOP;

/**
 * Test program for MyString2 class
 */
public class TestMyString2 {
    public static void main(String[] args) {
        // Test constructor
        MyString2 str1 = new MyString2("Hello");
        MyString2 str2 = new MyString2("World");
        MyString2 str3 = new MyString2("Hello");

        System.out.println("=== Testing MyString2 ===\n");

        // Test toString
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println();

        // Test compare
        System.out.println("=== Testing compare() ===");
        System.out.println("str1.compare(str2): " + str1.compare("World"));  // Negative
        System.out.println("str2.compare(str1): " + str2.compare("Hello"));  // Positive
        System.out.println("str1.compare(str3): " + str1.compare("Hello"));  // 0
        System.out.println("str1.compare(\"Hello World\"): " + str1.compare("Hello World")); // Negative
        System.out.println();

        // Test substring
        System.out.println("=== Testing substring() ===");
        MyString2 sub1 = str1.substring(1);
        System.out.println("str1.substring(1): " + sub1);  // "ello"
        MyString2 sub2 = str2.substring(2);
        System.out.println("str2.substring(2): " + sub2);  // "rld"
        System.out.println();

        // Test toUpperCase
        System.out.println("=== Testing toUpperCase() ===");
        MyString2 upper1 = str1.toUpperCase();
        System.out.println("str1.toUpperCase(): " + upper1);  // "HELLO"
        MyString2 upper2 = str2.toUpperCase();
        System.out.println("str2.toUpperCase(): " + upper2);  // "WORLD"
        System.out.println();

        // Test toChars
        System.out.println("=== Testing toChars() ===");
        char[] charArray = str1.toChars();
        System.out.print("str1.toChars(): ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        // Test valueOf
        System.out.println("=== Testing valueOf() ===");
        MyString2 boolTrue = MyString2.valueOf(true);
        MyString2 boolFalse = MyString2.valueOf(false);
        System.out.println("MyString2.valueOf(true): " + boolTrue);
        System.out.println("MyString2.valueOf(false): " + boolFalse);
        System.out.println();

        // Test additional helper methods
        System.out.println("=== Testing helper methods ===");
        System.out.println("str1.length(): " + str1.length());
        System.out.println("str1.charAt(1): " + str1.charAt(1));
    }
}
