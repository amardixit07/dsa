public class binaryToDecimal {
    //convert binary to decimal by recursion
    static int count=0;
    public static int convert(int num){
        if(num == 0){
            return 0;
        }
        int n=(int ) (num%10 * Math.pow(2,count));
        count++;
         
            return n + convert(num/10);

    }
    public static void main(String[] args) {
        //use power function to convert binary to decimal
        int binary = 101; //example binary number
        int decimal=convert(binary);
        System.out.println("Decimal value of binary " + binary + " is: " + decimal);
        
    
        
    }
    
}
