public class rotation {
    public static void main(String[] args) {
        int num=12345;
        int k=3;//rotate by 3
        int count=0;
        int copy=num;
        while(copy>0)
        {
            copy=copy/10;
            count++;
        }
        k=k%count;
        int devisor=(int) Math.pow(10, k);//1000
        int multiplier=(int) Math.pow(10, count-k);//100
        int first=num%devisor;//345
        int second=num/devisor;//12
        int result=(first*multiplier)+second;
        System.out.println(result);
    }
    
}
