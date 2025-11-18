package pattern;
import java.util.Scanner;

public class anydigitprint {
    
    // Function to print pattern of a single digit
    static void printDigit(int n) {
        switch (n) {
            case 0:
                print0(); break;
            case 1:
                print1(); break;
            case 2:
                print2(); break;
            case 3:
                print3(); break;
            case 4:
                print4(); break;
            case 5:
                print5(); break;
            case 6:
                print6(); break;
            case 7:
                print7(); break;
            case 8:
                print8(); break;
            case 9:
                print9(); break;
            default:
                System.out.println("Invalid input! Enter digit 0-9.");
        }
    }

    // ----------- DIGIT PATTERNS ---------------

    static void print0() {
        System.out.println(" *** ");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println(" *** ");
    }

    static void print1() {
        System.out.println("  *  ");
        System.out.println(" **  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
       System.out.println("  *  ");
        System.out.println(" *** ");
    }

    static void print2() {
        System.out.println(" *** ");
        System.out.println("*   *");
        System.out.println("    *");
        System.out.println("   * ");
        System.out.println("  *  ");
        System.out.println(" *   ");
        System.out.println("*****");
    }

    static void print3() {
        System.out.println(" *** ");
        System.out.println("*   *");
        System.out.println("    *");
        System.out.println(" *** ");
        System.out.println("    *");
        System.out.println("*   *");
        System.out.println(" *** ");
    }

    static void print4() {
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println("    *");
        System.out.println("    *");
        System.out.println("    *");
    }

    static void print5() {
        System.out.println("*****");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println(" *** ");
        System.out.println("    *");
        System.out.println("*   *");
        System.out.println(" *** ");
    }

    static void print6() {
        System.out.println(" *** ");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("**** ");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println(" *** ");
    }

    static void print7() {
        System.out.println("*****");
        System.out.println("    *");
        System.out.println("   * ");
        System.out.println("  *  ");
        System.out.println(" *   ");
        System.out.println(" *   ");
        System.out.println(" *   ");
    }

    static void print8() {
        System.out.println(" *** ");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println(" *** ");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println(" *** ");
    }

    static void print9() {
        System.out.println(" *** ");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println(" ****");
        System.out.println("    *");
        System.out.println("    *");
        System.out.println(" *** ");
    }
1
    // ----------- MAIN FUNCTION ---------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit (0-9): ");
        int d = sc.nextInt();

        printDigit(d);
    }
}

    

