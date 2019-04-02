package Method;
import java.util.*;
public class MatrixInput {
	public static void main (String [] args) {
			
		int [][] array1 = new int[3][3];
		int [][] array2 = new int[3][3];
		int [][] array3 = new int[3][3];
		int [][] array4 = new int[3][3];
		int [][] array5 = new int[3][3];
		
		array1=matrixInput();
		array2=matrixInput();
		array3=matrixSummation(array1,array2);
		array4=matrixSubtraction(array1,array2);
		array5=matrixMultiplication(array1,array2);
		
//	    matrixPrint(array1);
	    System.out.println("Summation: ");	
	    matrixPrint(array3);

	    System.out.println();
	    
	    System.out.println("Subtraction: ");
	    matrixPrint(array4);
	    
	    System.out.println();
	    
	    System.out.println("Multiplication: ");
	    matrixPrint(array5);
	    
	}
		
	public static int[][] matrixInput() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		int [][] array = new int [3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array[i][j]=input.nextInt();
			}
		}
		return array;		
	}
		
	public static void matrixPrint(int [][] array) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(array[i][j]<0 || array[i][j]>10)
				System.out.print(+array[i][j]+" ");
				
				else
					System.out.print(" "+array[i][j]+" ");
			}
			System.out.println();
		}
	}		
	
	public static int[][] matrixSummation(int[][] array1,int[][] array2) {
		
		int [][] array3= new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array3 [i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		return array3;
	}
	
	public static int[][] matrixSubtraction(int[][] array1,int[][] array2) {
		
		int [][] array3= new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array3 [i][j]=array1[i][j]-array2[i][j];
			}
		}
		
		return array3;		
	}
	
	public static int[][] matrixMultiplication(int[][] array1,int[][] array2){
		int [][] array3= new int[3][3];
		int [][] array5= new int[3][3];
		
		int multiplication=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3;k++ ) {
			    multiplication=multiplication+array1[i][k]*array2[k][j];
			}
				array5[i][j]=multiplication;
				multiplication=0;
		}	
	}
		return array5;
	}
}