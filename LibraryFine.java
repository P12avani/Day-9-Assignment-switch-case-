/*A library system calculates fines based on days overdue:
•	Code 1: 1–5 days → $1/day
•	Code 2: 6–10 days → $2/day
•	Code 3: >10 days → $5/day
The user inputs a code and days overdue, and the program outputs the total fine or "Invalid Code".

Input Format:
Two integers: code and days, separated by a space.

Output Format:
An integer (total fine) or the string "Invalid Code

Example
•	Input: 1 3
•	Output: 3

Constraints:
•	1 ≤ code ≤ 3
•	1 ≤ days ≤ 30
•	Use a switch statement*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class LibraryFine {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int code=scanner.nextInt();
		int days=scanner.nextInt();
		int fine=0;
		switch(code) {
		case 1:
			if(days>=1&&days<=5) {
				fine=days*1;
				break;
				}
			
			else {
				System.out.println("Invalid code");
				break;
			}
		case 2:
				if(days>=6&&days<=10) {
					fine=days*2;
				break;
				}
				else {
					System.out.println("Invalid code");
					break;
				}
		case 3:
			if(days>10&&days<=30) {
				fine=days*5;
			break;
			}
			else {
				System.out.println("Invalid code");
				break;
			}
			default:
				System.out.println("Invalid code");
				return;
			}
		
	if(fine!=0)
		System.out.println(fine);
	}

}
