package assignment1;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		int per=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Percentage = ");
		per=sc.nextInt();
		
		if(per>=70 && per<=100) {
			System.out.println("Distinction");
		}
		else if(per>=60 && per<=69) {
			System.out.println("First Class");		
		}
		else if(per>=50 && per<=59) {
			System.out.println("Second Class");
		}
		else if(per>=35 && per<=49) {
			System.out.println("Pass Class");
		}
		else if(per>=0 && per<=34) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid percentage");
		}

	}

}
