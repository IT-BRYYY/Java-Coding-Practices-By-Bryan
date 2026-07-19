package OOP;

/**
 * MyString2 class - A custom implementation of String-like functionality
 * Based on Chapter 10 concepts from Daniel Liang's "Introduction to Java Programming"
 */
public class MyString2 {
    // Data field to store the characters
    private char[] chars;

    /**
     * Constructor that creates a MyString2 object from a String
     * @param s the input string
     */
    public MyString2(String s) {
        chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
    }

    /**
     * Compares this string with another string lexicographically
     * @param s the string to compare with
     * @return 0 if equal, negative if this string is less, positive if greater
     */
    public int compare(String s) {
        int minLength = Math.min(chars.length, s.length());

        for (int i = 0; i < minLength; i++) {
            if (chars[i] != s.charAt(i)) {
                return chars[i] - s.charAt(i);
            }
        }

        // If all characters in the shorter string match
        return chars.length - s.length();
    }

    /**
     * Returns a substring starting from the specified index
     * @param begin the starting index (inclusive)
     * @return a new MyString2 object containing the substring
     */
    public MyString2 substring(int begin) {
        if (begin < 0 || begin >= chars.length) {
            throw new IndexOutOfBoundsException("Begin index out of bounds");
        }

        char[] subChars = new char[chars.length - begin];
        for (int i = begin; i < chars.length; i++) {
            subChars[i - begin] = chars[i];
        }

        MyString2 result = new MyString2(new String(subChars));
        return result;
    }

    /**
     * Converts all characters in this string to uppercase
     * @return a new MyString2 object with all characters in uppercase
     */
    public MyString2 toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                upperChars[i] = (char)(chars[i] - ('a' - 'A'));
            } else {
                upperChars[i] = chars[i];
            }
        }
        return new MyString2(new String(upperChars));
    }

    /**
     * Converts this string to a character array
     * @return an array of characters
     */
    public char[] toChars() {
        char[] result = new char[chars.length];
        System.arraycopy(chars, 0, result, 0, chars.length);
        return result;
    }

    /**
     * Returns a string representation of a boolean value
     * @param b the boolean value
     * @return a new MyString2 object containing "true" or "false"
     */
    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
    }

    /**
     * Override toString to return the string representation
     * @return the string representation of this object
     */
    @Override
    public String toString() {
        return new String(chars);
    }

    /**
     * Helper method to get the length of this string
     * @return the length of the string
     */
    public int length() {
        return chars.length;
    }

    /**
     * Helper method to get character at specified index
     * @param index the index
     * @return the character at the specified index
     */
    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }
}
