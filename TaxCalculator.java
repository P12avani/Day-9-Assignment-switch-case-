/*A tax calculator applies rates based on region:
•	1 for North: 5%
•	2 for South: 6%
•	3 for East: 7%
•	4 for West: 8%
The user provides a region code and income, and the program calculates the tax based on the region’s percentage rate. If the region code is not between 1 and 4, the output should be "Invalid Region".
 
 Input Format:
Two integers — code and income, separated by a space.

 Output Format:
Print an integer (tax amount) or the string "Invalid Region"

 Constraints:
•	1 ≤ code ≤ 4
•	0 ≤ income ≤ 1,000,000
•	Use a switch statement*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int code=scanner.nextInt();
		int income=scanner.nextInt();
		int tax=0;
		switch (code) {
		case 1:
			tax=income*5/100;
			break;
		case 2:
			tax=income*6/100;
			break;
		case 3:
			tax=income*7/100;
			break;
		case 4:
			tax=income*8/100;
			break;
			default:
				System.out.println("Invalid Region");
				return;
		}
System.out.println(tax);
	}
}

