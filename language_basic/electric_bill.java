import java.util.Scanner;

public class electric_bill {
    public static void main(String[] args) {
        System.out.println("Welcome to the Electric Bill Calculator");
        System.out.println("---------------------------------------");
        System.out.println("Rate Structure:");
        System.out.println("First 100 units: Rs 1.5 per unit");
        System.out.println("Next 100 units: Rs 2.5 per unit");
        System.out.println("Above 200 units: Rs 3.5 per unit");

        double rate1=1.5; 
        double rate2=2.5;  
        double rate3=3.5; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units = Integer.parseInt(sc.nextLine());
        if(units<0){
            System.out.println("invalid input");
            sc.close();
            return;
           
    
        }
        double billAmount = 0;
        if (units <= 100) {
            billAmount = units * rate1;
        } else if (units <= 200) {
            billAmount = (100 * rate1) + ((units - 100) * rate2);
        } else {
            billAmount = (100 * rate1) + (100 * rate2) + ((units - 200) * rate3);
        }
    
    System.out.println("Total Electric Bill Amount: Rs " + billAmount);
        sc.close();
    
}
}
