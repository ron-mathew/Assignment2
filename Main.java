// Main.java
// Import necessary utilities
import java.util.*;

class Main {
    public static void main(String args[]) {
        // Create instances of UserInput and ArrayFunctions classes
        UserInput ui = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        // Accept user input and store it in an array
        int[] array = ui.arrayInput();

        // Separate numbers into even and odd categories
        functions.evenOdd(array);

        // Find and display the index of the closest neighboring numbers
        int index = functions.mindiff(array);
        System.out.println("Index with minimum difference: " + index);

        // Convert array to ArrayList and display it
        ArrayList<Integer> list = functions.arrayToList(array);
        System.out.println("Converted Array to ArrayList: " + list);

        // Convert ArrayList back to an array and display it
        int[] newArray = functions.listToArray(list);
        System.out.println("Converted ArrayList back to array: " + Arrays.toString(newArray));
    }
}
