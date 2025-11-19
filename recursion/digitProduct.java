public class digitProduct {
    public static int product(int n ,int m) 
    {
        if (n==0 || m==0) 
        {
            return 0;
        }
        int ld= (n%10) * (m%10);
        return ld + 10 * product(n/10 , m/10);
    }
    public static void main(String[] args) {
        int n=12;
        int m=5678;
        int result=product(n , m);
        System.out.println("The product of digits is: " + result);
    }

    
}
