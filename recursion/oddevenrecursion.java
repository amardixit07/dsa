
class oddevenrecursion {
    public void countoddeven(int num, int oddCount, int evenCount) {
        // base case
        if (num == 0) {
            System.out.println("Odd digits: " + oddCount);
            System.out.println("Even digits: " + evenCount);
            return;
        }
        // recursive case
        int digit = num % 10;
        if (digit % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
        countoddeven(num / 10, oddCount, evenCount);
    }
    public static void main(String[] args) {
        oddevenrecursion obj = new oddevenrecursion();
        int number = 123456789;
        obj.countoddeven(number, 0, 0);
    }
}