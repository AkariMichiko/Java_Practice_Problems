package Basic;
import java.util.*;
public class Swap {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = input.nextInt();
		
		System.out.print("Enter b: ");
		int b = input.nextInt();
		
		int x;
		
		x=a;
		a=b;
		b=x;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);

	}

}
