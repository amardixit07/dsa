public class extract_num {
    public static void main(String[] args) {
        int x= 34567;
        while(x>0)
        {
            int rem=x%10;
            System.out.println(rem);
            x=x/10;

        }   
    }
    
}
