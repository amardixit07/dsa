public class swapDigits {
    public static void main(String[] args) {
        int num=1234;
        num=num/10;
        int copy=num;
        int fd=num%10;//4
        int count=0;
        while (copy>0) {
            copy=copy/10;
            count++;
            
        }
        int devisor= (int) Math.pow(10, count-1);
        int mid=num%devisor;
        int ld=num/devisor;
        System.out.println((devisor*fd)+mid+ld);
    }
    
}
