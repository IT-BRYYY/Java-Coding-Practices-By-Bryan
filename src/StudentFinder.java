public class StudentFinder {
    public static int binarySearch(int []list , int key){
        int low = 0;
        int high = list.length -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(key < list[mid])
                high = mid - 1;
            else if(key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String []args){

        int [] studentsIDs = {1001, 1002, 1003, 1004, 1005,
                1006, 1007, 1008, 1009, 1010};

        String [] grades = {"A", "B", "A+", "C", "B+",
                            "A", "D", "B", "A+", "C"};

        int searchID = 1007;
        int result = binarySearch(studentsIDs, searchID);

        if(result == -1)
            System.out.println("Student ID " + searchID + " NOT FOUND!");
        else
            System.out.println("Student ID " + searchID + " found! Grade: " + grades[result]);
    }
}
