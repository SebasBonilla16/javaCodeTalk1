// This is a Java class named PrimeNumber.
public class PrimeNumber {

    // This method checks if a given integer 'number' is a prime number.
    // It returns true if 'number' is prime and false otherwise.
    public static boolean isPrime(int number) {
        // Check if 'number' is less than or equal to 1.
        // Numbers less than or equal to 1 are not prime by definition.
        if (number <= 1) {
            // If 'number' is less than or equal to 1, return false.
            // A prime number is always greater than 1.
            return false;
        }

        // Use a for loop to iterate from 2 to 'number - 1'.
        // 'i' represents the current iteration and starts from 2.
        // The loop will run until 'i' is less than 'number'.
        // Note: We start from 2 because every number is divisible by 1 and itself,
        // so checking from 2 to 'number - 1' is sufficient to determine primality.
        for (int i = 2; i < number; i++) {
            // Check if 'number' is divisible by the current value of 'i'.
            // If the remainder of the division is 0, it means 'number' is divisible by 'i'.
            // In that case, 'number' is not a prime number, so return false.
            if (number % i == 0) {
                return false;
            }
        }

        // If 'number' is not divisible by any number from 2 to 'number - 1',
        // then it is a prime number. So, return true.
        return true;
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Declare and initialize a variable 'number' with the value 17.
        int number = 17;

        // Call the 'isPrime' method with the 'number' variable as an argument.
        // The method will check if 'number' is a prime number and return a boolean result.
        // The result will be stored in the 'isPrime' variable, which is of type boolean.
        boolean isPrime = isPrime(number);

        // Check the 'isPrime' variable to determine if 'number' is prime or not.
        if (isPrime) {
            // If 'isPrime' is true, then 'number' is prime.
            System.out.println(number + " is a prime number.");
        } else {
            // If 'isPrime' is false, then 'number' is not prime.
            System.out.println(number + " is not a prime number.");
        }
    }
}
