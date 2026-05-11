import java.util.Arrays;

public class ContactList {
    public static void main(String[] args) {

        // Contact list
        String[] contacts = {"Zack", "Alice", "Mike", "Diana", "Bob", "Eve", "John"};
        String[] numbers  = {"09171234567", "09181234567", "09191234567",
                "09201234567", "09211234567", "09221234567", "09231234567"};

        // 1. toString - display original contact list
        System.out.println("===== CONTACT LIST =====");
        System.out.println("Original contacts:");
        System.out.println(Arrays.toString(contacts));

        // 2. sort - sort contacts alphabetically
        Arrays.sort(contacts);
        System.out.println("\nSorted contacts (A-Z):");
        System.out.println(Arrays.toString(contacts));

        // 3. binarySearch - search for a contact
        String searchName = "Mike";
        int index = Arrays.binarySearch(contacts, searchName);
        System.out.println("\nSearching for: " + searchName);
        if (index >= 0) {
            System.out.println("Found! " + searchName + " is at index " + index);
        } else {
            System.out.println(searchName + " is not in your contacts!");
        }

        // 4. fill - replace deleted contacts with "Unknown"
        String[] updatedContacts = {"Zack", "Alice", "Mike", "Diana", "Bob", "Eve", "John"};
        System.out.println("\nDeleting contacts from index 2 to 4...");
        Arrays.fill(updatedContacts, 2, 5, "Unknown");
        System.out.println("Updated contacts:");
        System.out.println(Arrays.toString(updatedContacts));

        // 5. equals - check if contact list changed
        boolean same = Arrays.equals(contacts, updatedContacts);
        System.out.println("\nIs contact list unchanged? " + same);

        // 6. display all contacts with numbers
        System.out.println("\n===== FULL CONTACT DETAILS =====");
        String[] finalContacts = {"Alice", "Bob", "Diana", "Eve", "John", "Mike", "Zack"};
        for (int i = 0; i < finalContacts.length; i++) {
            System.out.println(finalContacts[i] + " - " + numbers[i]);
        }
    }
}