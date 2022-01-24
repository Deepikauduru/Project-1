package assignment1;
import java.util.Scanner;

public class DivisibleorNot {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		
		if(n%5==0) {
			System.out.println("Given Number is Dvisible by 5");
		}
		else {
			System.out.println("Given number is not divisible by 5");
		}
		

	}

}
