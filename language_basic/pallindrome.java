import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("input the number");
        int num=sc.nextInt();
        int copy=num;
        int result=0;
        while(num>0)
        {
            int temp=num%10;
            result=result*10+temp;
            num=num/10;

            
        }
        if (result==copy)
        {
            System.out.println("num is pallindrome");

        }
        else
        {
System.out.println("num is not pallindrome");
        }
        sc.close();
    }
    
    
}
