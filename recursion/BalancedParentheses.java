public class BalancedParentheses {

    static void generate(int open, int close, String current) {

        // If no brackets left → valid answer
        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }

        // Add "(" if available
        if (open > 0) {
            generate(open - 1, close, current + "(");
        }

        // Add ")" only if it doesn't break validity
        if (close > open) {
            generate(open, close - 1, current + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate(n, n, "");
    }
}
