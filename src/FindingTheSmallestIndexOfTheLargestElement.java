public class FindingTheSmallestIndexOfTheLargestElement {
    public static void main (String[] args) {

        // array with 6 values
        double [] myList = {1, 5, 3, 4, 5, 5};

        // start by assuming slot 0 has the largest value
        double max = myList[0];

        // remember the index of the largest value, starts at 0
        int indexOfMax = 0;

        // start at 1 because slot 0 is already saved in max
        for (int i = 1; i < myList.length; i++){

            // check if current slot is bigger than max
            if(myList[i] > max){

                // if yes, update max with the new largest value
                max = myList[i];

                // remember which slot the new largest was found in
                indexOfMax = i;
            }
        }

        // print the results
        System.out.println("Largest value: " + max);
        System.out.println("Found at index: " + indexOfMax);
    }
}