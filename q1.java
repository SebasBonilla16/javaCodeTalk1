// This is a Java class named Factorial.
public class Factorial {

    // This method calculates the factorial of an integer 'n' and returns the result.
    public static int factorial(int n) {
        // Initialize a variable 'result' to store the factorial result, and set it to 1.
        int result = 1;

        // Use a for loop to iterate from 1 to 'n'.
        // 'i' represents the current iteration and starts from 1.
        // The loop will run until 'i' is less than or equal to 'n'.
        for (int i = 1; i <= n; i++) {
            // Multiply the 'result' by the current value of 'i'.
            // This calculates the factorial as the product of all numbers from 1 to 'n'.
            // For example, if 'n' is 5, then the loop multiplies: 1 * 2 * 3 * 4 * 5
            // After each iteration, the value of 'result' will be updated accordingly.
            result *= i;
        }

        // Return the final factorial result.
        return result;
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Declare and initialize a variable 'number' with the value 5.
        int number = 5;

        // Call the 'factorial' method with the 'number' variable as an argument.
        // The method will calculate the factorial of 'number' and return the result.
        // The result will be stored in the 'result' variable.
        int result = factorial(number);

        // Print the result of the factorial calculation along with the input number.
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
