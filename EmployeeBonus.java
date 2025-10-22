/*A company awards bonuses based on employee role:
•	Role Code 1 (Manager): 10% of salary
•	Role Code 2 (Developer): 5% of salary
•	Role Code 3 (Intern): $500 flat bonus
The user inputs a role code and salary, and the program outputs the bonus amount or "Invalid Role".

Input Format:
Two integers: code and salary, separated by a space.

Output Format:
An integer (bonus amount) or the string "Invalid Role".

Example:
•	Input: 1 50000
•	Output: 5000

Constraints:
•	1 ≤ code ≤ 3
•	1000 ≤ salary ≤ 100000
•	Use a switch statement*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int roleCode=scanner.nextInt();
		int salary=scanner.nextInt();
		int bonusAmount=0;
		switch (roleCode) {
		case 1:  //manager
			bonusAmount=salary*10/100;
			break;
		
		case 2:  //developer
			bonusAmount=salary*5/100;
			break;
		case 3: //Intern
			bonusAmount=500;
			break;
			default:
				System.out.println("Invalid Role");
			return;
		}
		System.out.println(bonusAmount);
		scanner.close();

	}

}
