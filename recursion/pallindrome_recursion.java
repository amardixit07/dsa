public class pallindrome_recursion {
    /// check for pallindrome by recursion
  
    static void findpallindrom(int original ,int reverse,int current) {
        if(current == 0) {
            if(original == reverse) {
                System.out.println("Pallindrome");
            } else {
                System.out.println("Not a Pallindrome");
            }
            return;
        }
        int digit = current % 10;
        reverse = reverse * 10 + digit;
        findpallindrom(original, reverse, current / 10);
      
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println("Checking for number: " + num);
        findpallindrom(num, 0, num);
    }
    


    
}
