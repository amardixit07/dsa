public class decimalToBinary {
    //convert decimal to binary by recursion
    public static int convert(int num){
        if(num == 0){
            return 0;
        }
        int n = num % 2;
        return n + 10 * convert(num / 2);
    }
    public static void main(String[] args) {
        int decimal = 5; //example decimal number
        int binary = convert(decimal);
        System.out.println("Binary value of decimal " + decimal + " is: " + binary);
    }
    
}
