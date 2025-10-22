package com.codegnan.contolstatements;
import java.util.Scanner;
public class AdvancedCanteenSystem {

	public static void main(String[] args) {
		final int PRICE_TEA = 10;
        final int PRICE_COFFEE = 15;
        final int PRICE_SAMOSA = 20;
        final double TAX_RATE = 0.05;

        int teaQty = 0;
        int coffeeQty = 0;
        int samosaQty = 0;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("||=========== CANTEEN MENU ===========||");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Checkout and Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1: // View Menu
                System.out.println();
                System.out.println("--- MENU ---");
                System.out.println("1. Tea     - ₹10");
                System.out.println("2. Coffee  - ₹15");
                System.out.println("3. Samosa  - ₹20");
                break;
            case 2: // Order Items
                System.out.print("Enter item number to order (1-3): ");
                int item = scanner.nextInt();
                switch (item) {
                    case 1: // Tea
                        System.out.print("Enter quantity: ");
                        int q1 = scanner.nextInt();
                        if (q1 <= 0) {
                            System.out.println("Quantity must be greater than 0.");
                        } else {
                            teaQty += q1;
                            System.out.println(q1 + " Tea(s) added.");
                        }
                        break;
                        
                    case 2: // Coffee
                        System.out.print("Enter quantity: ");
                        int q2 = scanner.nextInt();
                        if (q2 <= 0) {
                            System.out.println("Quantity must be greater than 0.");
                        } else {
                            coffeeQty += q2;
                            System.out.println(q2 + " Coffee(s) added.");
                        }
                        break; 
                        
                    case 3: // Samosa
                        System.out.print("Enter quantity: ");
                        int q3 = scanner.nextInt();
                        if (q3 <= 0) {
                            System.out.println("Quantity must be greater than 0.");
                        } else {
                            samosaQty += q3;
                            System.out.println(q3 + " Samosa(s) added.");
                        }
                        break;
                    default:
                        System.out.println("Invalid item number");
                }
                    case 3: // View Bill
                        System.out.println();
                        System.out.println("--- BILL ---");
                        int teaCost = teaQty * PRICE_TEA;
                        int coffeeCost = coffeeQty * PRICE_COFFEE;
                        int samosaCost = samosaQty * PRICE_SAMOSA;
                        int subtotal = teaCost + coffeeCost + samosaCost;
                        if (teaQty > 0) {
                            System.out.println("Tea x" + teaQty + " = ₹" + teaCost);
                        }
                        if (coffeeQty > 0) {
                            System.out.println("Coffee x" + coffeeQty + " = ₹" + coffeeCost);
                        }
                        if (samosaQty > 0) {
                            System.out.println("Samosa x" + samosaQty + " = ₹" + samosaCost);
                        }

                        System.out.println("Subtotal = ₹" + subtotal);
                        double tax = subtotal * TAX_RATE;
                        double total = subtotal + tax;
                        System.out.println("Tax (5%) = ₹" + tax);
                        System.out.println("Total = ₹" + total);
                        break;  
                    case 4: // Checkout and Exit
                        System.out.println("Thank you! Exiting system");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
	}

}
	}
}
