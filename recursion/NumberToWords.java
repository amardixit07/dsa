import java.util.*;

public class NumberToWords {

    // Function to print a single digit as word using switch
    static void printWord(int digit) {
        switch (digit) {
            case 0: System.out.print("zero "); break;
            case 1: System.out.print("one "); break;
            case 2: System.out.print("two "); break;
            case 3: System.out.print("three "); break;
            case 4: System.out.print("four "); break;
            case 5: System.out.print("five "); break;
            case 6: System.out.print("six "); break;
            case 7: System.out.print("seven "); break;
            case 8: System.out.print("eight "); break;
            case 9: System.out.print("nine "); break;
        }
    }

    // Recursive function
    static void numberToWords(int num) {
        if (num == 0) {
            return;
        }

        // First go to the most significant digit
        numberToWords(num / 10);

        // Then print the last digit
        printWord(num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("zero");
        } else {
            numberToWords(num);
        }
    }
}

