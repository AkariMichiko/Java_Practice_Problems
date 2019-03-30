package Loops;
import java.util.*;
public class MultiplicationTable {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=input.nextInt();
		int sum;
		for(int i=1; i<=10; i++) {
			sum=i*n;
			System.out.println(sum);
		}
	}

}
