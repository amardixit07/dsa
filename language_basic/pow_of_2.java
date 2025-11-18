public class pow_of_2 {
    public static void main(String[] args) {
        int n=312;
        int original=n;
        while(n>1)
        {
            if(n%2==0)
            {  n=n/2;
                System.out.println(original+" is in  power of 2");
                return;
            }
            else
            {
                System.out.println(original+" is not in power of 2");
                return;
            }
           
        }
    }
    
}
