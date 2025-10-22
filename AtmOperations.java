package com.codegnan.contolstatements;
import java.util.Scanner;
public class AtmOperations {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double balance=50000;
		int pin=1234;
		int enteredPin;
		System.out.println("Enter your pin");
		enteredPin=scanner.nextInt();
		if(enteredPin!=pin) {
			System.out.println("Invalid pin.Exisiting");
			return;
		}
		int choice;
		do {
			System.out.println("||======================================||");
			System.out.println("||===========ATM Menu==============||");
			System.out.println("||============1.Deposit===============||");
			System.out.println("||=============2.Withdraw=============||");
			System.out.println("||=============3.Check balance=============||");
			System.out.println("||=============4.Exit=============||");
			System.out.println("||=======================================||");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Deposir Amount:");
				double depositAmount=scanner.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("please deposit multiples of hunders"+"like[700'1000'2000]");
					
				}else {
					if(depositAmount<500) {
						System.out.println("please deposite more than 500 rupees");
					}else {
						balance+=depositAmount;
						System.out.println("Deposited:"+depositAmount+"Amount succesfully.new balance:"+balance);
					}
				}
				break;
			case 2:
				System.out.println("Enter Withdraw Amount:");
			double withdrawAmount=scanner.nextDouble();
			if(withdrawAmount%100!=0) {
				System.out.println("please withdraw multiples of hunders"+"like[700'1000'2000]");
				
			}else {
				if(withdrawAmount<500) {
					System.out.println("please withdraw more than 500 rupees");
				}else {
					if(withdrawAmount>balance) {
						System.out.println("Insufficient funds");
					}else {
						balance-=withdrawAmount;
						System.out.println("Amount withdrawn succesfully"+withdrawAmount+"new Balance"+balance);
					}
				
				}
			}
		break;
			
			case 3:
				System.out.println("your account balance is:"+balance);
				break;
			case 4:
				System.out.println("Exisiting... Thank you for Using ATM.");
				break;
				default:
					System.out.println("Invalid Choice.Please choose a valid option[1-4]");
					break;
		}
	} while(choice !=4);
	scanner.close();
}
}
		
	


