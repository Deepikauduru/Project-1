package assignment1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int p=10000;
		int r=2;
		int t=1;
		int SI;
		SI =p*r*t;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Enter p= \n2.Enter r=\n3.Enter t=");
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		System.out.println("Simple Interest:" +SI);
		
		

	}

}
