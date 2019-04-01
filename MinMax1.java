package Array;
import java.util.*;
public class MinMax1 {
	public static void main (String [] args) {		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size: ");
		int x= input.nextInt();
		int [] array = new int [x];
		System.out.print("Enter values: ");
		for(int i=0; i<array.length;i++) {
			array[i]=input.nextInt();
		}
		int max=array[0];
		int min=array[0];
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
//				System.out.print(max);
			}
				
		}
		System.out.println("Maximum number is: "+max);
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
//				System.out.print(min);
			}
		}
		
		System.out.println("Minimum number is: "+min);
	
	}

	}



