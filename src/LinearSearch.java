public class LinearSearch {

    // linear search method
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;    // found! return index
        }
        return -1;           // not found
    }

    public static void main(String[] args) {
        // our array
        int[] list = {5, 3, 8, 1, 9, 2, 7};

        // key we are searching for
        int key = 9;

        // call linearSearch method
        int result = linearSearch(list, key);

        // check result
        if (result != -1)
            System.out.println("Key " + key + " found at index " + result);
        else
            System.out.println("Key " + key + " not found!");
    }
}