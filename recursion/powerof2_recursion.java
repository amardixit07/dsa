public class powerof2_recursion {
    // check if a number is power of 2 using recursion

    static boolean isPowerOfTwo(int n) {
        // base case
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 2 != 0) {
            return false;
        }
        // recursive case
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        int number = 16;
        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
    
}
