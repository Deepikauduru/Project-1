package assignment1;

import java.util.Scanner;

public class Sumof10Num {

	public static void main(String[] args) {
		int i,num,sum=0;
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of first 10 numbers is:" +sum);	

	}

}
