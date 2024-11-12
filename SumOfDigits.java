public class SumOfDigits {
    public static int sumOfDigits(int n) {
        // Base condition
        if (n < 10) {
            return n;
        }
        
        // Recursive flow
        return (n % 10) + sumOfDigits(n / 10);
    }

    //Testing the recursive flow
    public static void main(String[] args) {
        int[] numbers = {10, 12, 110, 112};
        
        for (int n : numbers) {
            int sum = sumOfDigits(n);
            System.out.println("Sum of digits of " + n + " is: " + sum);
        }
    }
}