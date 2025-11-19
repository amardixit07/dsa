public class armstrong {
    // check for armstrong number using recursion
    // An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

    static int countDigits(int num) {
        // base case
        if (num == 0) {
            return 0;
        }
        // recursive case
        else {
            return 1 + countDigits(num / 10);
        }
    }

    static int power(int base, int exp) {
        // base case
        if (exp == 0) {
            return 1;
        }
        // recursive case
        else {
            return base * power(base, exp - 1);
        }
    }

    static int sumOfPowers(int num, int digitCount) {
        // base case
        if (num == 0) {
            return 0;
        }
        // recursive case
        else {
            int digit = num % 10;
            return power(digit, digitCount) + sumOfPowers(num / 10, digitCount);
        }
    }

    public static void main(String[] args) {
        int number = 153; // Example number
        int digitCount = countDigits(number);
        int sum = sumOfPowers(number, digitCount);

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
}
