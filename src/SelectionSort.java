public class SelectionSort {

    public static void selectionSort(double[] list) {

        // outer loop controls which position we are currently filling
        // starts at index 0 and moves left to right
        // stops one before the last element since last element auto sorts itself
        for (int i = 0; i < list.length - 1; i++) {

            // assume the first element of the unsorted portion is the smallest
            double currentMin = list[i];
            int currentMinIndex = i;

            // inner loop scans everything to the right of i
            // looking for a value smaller than currentMin
            for (int j = i + 1; j < list.length; j++) {

                // if a smaller value is found, update currentMin and its index
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // at this point currentMin holds the smallest value
            // and currentMinIndex holds where it is located

            // only swap if the smallest element is not already in correct position
            if (currentMinIndex != i) {
                // put list[i] into the old minimum position
                list[currentMinIndex] = list[i];
                // put the smallest value into position i
                // no temp variable needed since currentMin already saved the value
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {

        // sample array to sort
        double[] list = {2.0, 9.0, 5.0, 4.0, 8.0, 1.0, 6.0};

        // print the array before sorting
        System.out.print("Before sorting: ");
        for (double num : list) {
            System.out.print(num + " ");
        }

        // call selection sort to sort the array
        selectionSort(list);

        // print the array after sorting
        System.out.print("\nAfter sorting:  ");
        for (double num : list) {
            System.out.print(num + " ");
        }
    }
}