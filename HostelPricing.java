/*A hotel system prices rooms based on type and season:
•	Room Types:
o	1: Standard
o	2: Deluxe
•	Seasons:
o	1: Peak
o	2: Off-Peak
•	Prices:
o	Standard Room:
	Peak → $100
	Off-Peak → $80
o	Deluxe Room:
	Peak → $200
	Off-Peak → $150

Input Format:
Two integers: room and season, separated by a space.
Output Format:
One of:
"$100", "$80", "$200", "$150", or "Invalid Input"

Example:
•	Input: 1 1
•	Output: $100

Constraints:
•	1 ≤ room ≤ 2
•	1 ≤ season ≤ 2
•	Use a switch statement for room type*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class HostelPricing {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int room=scanner.nextInt();
		int season=scanner.nextInt();
		int price=0;
		switch (room) {
		case 1:
			if(season==1) {
				price=100; //peak
				break;
			}else {
				if(season==2) {
					price=80;  //off-peak
					break;
				} else {
					System.out.println("Invalid Input");
					return;
				}
			
			}
		case 2:
			if(season==1) {
				price=200;
				break;
			}else {
				if(season==2) {
					price=150;
					break;
				}else {
					System.out.println("Invalid Input");
					return;
				}
				
			}
			default:
				System.out.println("Invalid Input");
				return;
		
		}
           System.out.println("$" +price);
	}

}
