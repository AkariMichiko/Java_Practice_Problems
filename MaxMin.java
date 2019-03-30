package Basic;
import java.util.*;
public class MaxMin {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = input.nextInt();
		
		System.out.print("Enter b: ");
		int b = input.nextInt();
		
		System.out.print("Enter c: ");
		int c = input.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("Max a");
			}
			else {
				System.out.println("Max c");
			}
		}
		
		else {
			if(b>c) {
				System.out.println("Max b");
			}
			else {
				System.out.println("Max c");
			}
		}
		
		if(a<b) {
			if(a<c) {
				System.out.println("Min a");
			}
			else {
				System.out.println("Min c");
			}
		}
		else {
			if(b<c) {
				System.out.println("Min b");
			}
			else {
				System.out.println("Min c");
			}
		}
		
	}

}
