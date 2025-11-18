public class flip_digits {
    public static void main(String[] args) {
        int digit;
        int num =32145;
        //output=21543
        int position=1;
        int result=0;
        while(num>0)
        { digit=num%10;
            num=num/10;
             
        result+=(int) ( position*Math.pow(10, digit-1) );
        position++;
        
        

        }
        System.out.println(result);
    }
    
}
