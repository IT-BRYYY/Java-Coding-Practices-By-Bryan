public class EmployeeHours {
    public static void main(String[] args) {
        // 2D array storing work hours for 8 employees (7 days each)
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},  // Employee 0
                {7, 3, 4, 3, 3, 4, 4},  // Employee 1
                {3, 3, 4, 3, 3, 2, 2},  // Employee 2
                {9, 3, 4, 7, 3, 4, 1},  // Employee 3
                {3, 5, 4, 3, 6, 3, 8},  // Employee 4
                {3, 4, 4, 6, 3, 4, 4},  // Employee 5
                {3, 7, 4, 8, 3, 8, 4},  // Employee 6
                {6, 3, 5, 9, 2, 7, 9}   // Employee 7
        };

        // Compute total hours for each employee
        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++) {
                total += hours[i][j];
            }
            totalHours[i] = total;
        }

        // Track original employee indices
        int[] employeeIndex = new int[hours.length];
        for (int i = 0; i < employeeIndex.length; i++) {
            employeeIndex[i] = i;
        }

        // Selection sort by total hours (ascending)
        for (int i = 0; i < totalHours.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[j] < totalHours[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap totalHours
            int tempHours = totalHours[minIndex];
            totalHours[minIndex] = totalHours[i];
            totalHours[i] = tempHours;

            // Swap employeeIndex to track who is who
            int tempIndex = employeeIndex[minIndex];
            employeeIndex[minIndex] = employeeIndex[i];
            employeeIndex[i] = tempIndex;
        }

        // Display results
        System.out.println("Employee    Total Hours");
        System.out.println("----------------------");
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + employeeIndex[i] + "     " + totalHours[i]);
        }
    }
}