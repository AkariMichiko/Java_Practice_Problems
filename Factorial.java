package Basic;
import java.util.*;
public class Factorial {
	public static void main (String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter n: ");
		long n= input.nextInt();
		long sum=1;
		for(int i=1; i<=n;i++) {
			sum=sum*i;
			
		}
		System.out.println(sum);
	}

}
