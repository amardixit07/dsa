public class findpowof_digit {
    // find power of number of digits in a number using recursion

    public int pow(int num,int pow)
    {
        if (pow==0)
        {
            return 1;
        }
        int p;
       p= num*pow(num,pow-1);
         return p;
    }
    public static void main(String[] args) {
        findpowof_digit findpowof_digit = new findpowof_digit();
        int a = findpowof_digit.pow(2,3);
        System.out.println(a);
        
}}
