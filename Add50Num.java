package assignment1;

import java.util.Scanner;

public class Add50Num {

	public static void main(String[] args) {
		int i,num,sum=0;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
			System.out.println(" sum of first 50 numbers is:" +sum);	
			
	}

}
