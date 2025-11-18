public class prime_num {
    public static void main(String[] args) {
        int num=17;
        boolean isprime=true;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
             isprime=false;
             break;
            }
            System.out.println(i);
        }
        if(isprime){
            System.out.println(num +" : is prime");
        }
        else{
            System.out.println(num +": is not prime");
        }

        
    }
    
}
