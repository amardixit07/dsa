public class largest_num {
    public static void main(String[] args) {
        int x= 34567;
        int largest=0;
        while(x>0)
        {
            int rem=x%10;
            if(rem>largest)
            {
                largest=rem;
            }
            x=x/10;

        }   
        System.out.println(largest);
    }
    
}
