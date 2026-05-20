public class ExecutionTime {

    // Linear Search (Listing 7.6)
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    // Binary Search (Listing 7.7)
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Create array from 1 to 100,000,000
        final int SIZE = 100_000_000;
        int[] list = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            list[i] = i + 1;
        }

        int[] searchKeys = {1, 25_000_000, 50_000_000, 75_000_000, 100_000_000};

        System.out.printf("%-15s %-25s %-25s%n", "Key", "Linear Search Time (ns)", "Binary Search Time (ns)");
        System.out.println("-".repeat(65));

        for (int key : searchKeys) {
            // Linear Search timing
            long startTime = System.nanoTime();
            linearSearch(list, key);
            long endTime = System.nanoTime();
            long linearTime = endTime - startTime;

            // Binary Search timing
            startTime = System.nanoTime();
            binarySearch(list, key);
            endTime = System.nanoTime();
            long binaryTime = endTime - startTime;

            System.out.printf("%-15d %-25d %-25d%n", key, linearTime, binaryTime);
        }
    }
}