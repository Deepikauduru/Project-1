package assignment1;
import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
	
	int num1,num2,ans;	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1 value = " );
	num1=sc.nextInt();
	System.out.println("Enter num2 value = " );
	num2=sc.nextInt();
	System.out.println("+,-,*,/");
	String operator=sc.next();
		
	switch(operator)
	{		
		case "+" : ans= num1+num2;
		System.out.println("Addition is :" +ans);
		break;
		
		case "-" : ans=num1-num2;
		System.out.println("Subtraction is :" +ans);
		break;
		
		case "*" : ans=num1*num2;
		System.out.println("Multiplication is :"+ans);
		break;
		
		case "/" : ans=num1/num2;
		System.out.println("Division is :" +ans);
		break;
		
		default:
			System.out.println("Invalid Operator");
			break;								
	}
		
}
}
