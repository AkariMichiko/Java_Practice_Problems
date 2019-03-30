package Loops;
import java.util.*;
public class GCD {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1=input.nextInt();
		System.out.print("Enter n2: ");
		int n2=input.nextInt();
		int sum=0;
		while(n2!=0) {
			sum=n1%n2;
			n1=n2;
			n2=sum;
		}
		System.out.println("GCD is: "+n1);
	}	
}	