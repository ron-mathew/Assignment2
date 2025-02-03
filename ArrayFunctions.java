//ArrayFunctions.java
// Import necessary utilities
import java.util.*;

class ArrayFunctions {

    // Method to display the contents of an ArrayList
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    // Method to separate numbers into even and odd lists
    void evenOdd(int[] array) {
        ArrayList<Integer> even = new ArrayList<>(); // Stores even numbers
        ArrayList<Integer> odd = new ArrayList<>();  // Stores odd numbers

        // Iterate through the array and categorize numbers
        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        // Display even and odd numbers separately
        System.out.println("Even Numbers:");
        display(even);
        System.out.println("Odd Numbers:");
        display(odd);
    }

    // Method to find the index of the first number in the smallest distance pair
    int mindiff(int[] array) {
        if (array.length < 2) {
            System.out.println("Array is too small to compare differences.");
            return -1; // Return -1 if comparison is not possible
        }

        int mindiff = Integer.MAX_VALUE; // Initialize with a large value
        int mindiffindex = 0; // Index of first number in the closest pair

        // Iterate through the array to find the smallest absolute difference
        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]); // Calculate absolute difference
            if (diff < mindiff) {
                mindiff = diff;
                mindiffindex = i;
            }
        }
        System.out.println("Minimum difference is " + mindiff);
        return mindiffindex;
    }

    // Method to convert an array to an ArrayList
    ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    // Method to convert an ArrayList back to an array
    int[] listToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
