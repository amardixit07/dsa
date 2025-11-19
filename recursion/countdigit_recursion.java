public class countdigit_recursion {
    // count digits of a number using recursion

    static int countDigits(int num) {
        // base case
        if (num == 0) {
            return 0;
        }
        // recursive case
        else {
        return 1 + countDigits(num / 10);}
    }

    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
    
}
