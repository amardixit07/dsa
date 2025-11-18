import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        int dosa_price = 60;
        int idli_price = 40;
        int coldrink_price = 50;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Billing System");
        System.out.println("Menu :");
        System.out.println("1. dosa" + " : rs " + dosa_price);
        System.out.println("2. idli" + " : rs " + 40);
        System.out.println("3. colddrink" + " : rs " + 50);
        System.out.println("enter your choice");
        System.out.println("dosa quantity");
        int dosa_quantity = Integer.parseInt(scanner.nextLine());
        if(dosa_quantity<0){
            System.out.println("invalid input");
            return;
        }
        System.out.println("enter idli quantity");
        int idli_quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("enter coldrink quantity");
        int coldrink_quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("\n\n");
        System.out.println("********** mohan's BILL **********");
        System.out.println("dosa :-" + dosa_quantity + " : rs " + dosa_quantity * dosa_quantity);
        System.out.println("idli :-" + idli_quantity + " : rs " + idli_quantity * idli_price);
        System.out.println("coldrink :-" + coldrink_quantity + " : rs " + coldrink_quantity * coldrink_price);
        System.out.println("Total Amount :- rs " + (dosa_quantity * 60 + idli_quantity * 40 + coldrink_quantity * 50));
        System.out.println("**********************************");
        System.out.println("Thank you visit again");
        scanner.close();
    

    }
    
}
