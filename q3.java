// This code demonstrates how to sort an array of integers in ascending order using Java's Arrays class.
import java.util.Arrays;

// This is a Java class named ArraySorting.
public class ArraySorting {
    
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Declare and initialize an integer array 'numbers' with values {5, 2, 8, 1, 9}.
        int[] numbers = {5, 2, 8, 1, 9};

        // Use Arrays.sort() to sort the 'numbers' array in ascending order.
        // After this line, the 'numbers' array will be modified, and its elements will be sorted.
        Arrays.sort(numbers);

        // Print the sorted array.
        System.out.print("Sorted Array: ");
        // Use an enhanced for loop (for-each loop) to iterate through the 'numbers' array.
        // In each iteration, the 'number' variable will hold the current element of the array.
        for (int number : numbers) {
            // Print the current element followed by a space.
            System.out.print(number + " ");
        }
    }
}
