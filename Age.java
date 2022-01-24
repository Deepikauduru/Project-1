package assignment1;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		n=sc.nextInt();
		if(n>18) {
			System.out.println("Valid for vote");
		}
		else {
			System.out.println("Not Valid for Vote");
		}

	}

}
