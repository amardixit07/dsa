public class firstdigit {
    public static void main(String[] args) {
        int num=482563;
        int copy=num;
        //count the digits
        int count =0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count + " - digits");
        num=copy;
        //print last digit
        System.out.println(num%10);
        // print last digit
        //find devisor
        int divisor=1;
        for(int i=0;i<count-1;i++)
        {
            divisor=divisor*10;
        }
        System.out.println(divisor);
    int fd;
    while(num>0)
    {
        fd =num/divisor;
         System.out.println(fd);
        break;
    }
   
    
}
}
