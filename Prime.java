public class Prime {
    public static void main(String[] args) {
        int num = 29; // Number to check for primality
        boolean flag = false;

        // Loop to check for factors
        for (int i = 2; i <= num / 2; ++i) {
            // Condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        // Output the result
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}