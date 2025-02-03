// Import Scanner for user input
import java.util.*;

class UserInput {
    // Method to take an array input from the user
    int[] arrayInput() {
        int[] array = new int[5]; // Define an array of size 5
        Scanner scan = new Scanner(System.in); // Scanner object for input

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt(); // Read numbers into the array
        }

        return array; // Return the user-inputted array
    }
}
