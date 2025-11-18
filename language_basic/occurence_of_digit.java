import java.util.Scanner;

public class occurence_of_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n =sc.nextInt();
        System.out.println("enter the digit you want to find out the occurence ");
        int s=sc.nextInt();
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==s)
            {
                count++;

            }
            n=n/10;

        }
        System.out.println(count);
        sc.close();
    }
    
}
