package assignment1;

import java.util.Scanner;

public class Tableof5 {
	public static void main(String[] args) {
		int i, num;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			System.out.println(+(num*i));	
		}
		
	}


}
