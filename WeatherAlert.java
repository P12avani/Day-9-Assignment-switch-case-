/*A weather app issues alerts based on:
•	Condition code:
.	1 = Sunny
.	2 = Rainy
.	3 = Stormy
•	Temperature (in °C):
.	If condition is Stormy and temperature < 10°C, print "Severe Warning"
.	Otherwise, print the condition name.
.	If the code is not 1–3, print "Invalid Condition".

🔹 Input Format:
Two integers:
code (1 to 3) and temp (−20 to 50), separated by space.

🔹 Output Format:
A single string:
"Sunny", "Rainy", "Stormy", "Severe Warning", or "Invalid Condition"

 Example Input:
1 20

Example Output:
Sunny*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class WeatherAlert {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int code=scanner.nextInt();
		int temp=scanner.nextInt();
		switch (code) {
		case 1:
			System.out.println("Sunny");
			break;
		case 2:
			System.out.println("Rainy");
			break;
		case 3:
			if(temp<10) {
				System.out.println("Severe Warning");
				break;
			}
				else {
					System.out.println("Stormy");
					break;
				}
			default:
				System.out.println("Invalid Condition");
				return;
			}
	
		}

	}


