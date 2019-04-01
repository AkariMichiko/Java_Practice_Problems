package Array2D;
public class MatrixMultiplication {
	public static void main (String [] args) {

		int [][] array1= {{5,6,8},{6,9,0,},{8,0,9}};
		int [][] array2= {{7,0,9},{6,9,0},{4,0,3}};
		int [][] array3=new int [3][3];
		
		int multiplication=0;
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				for(int k=0; k<3;k++) {
					multiplication=multiplication+array1[i][k]*array2[k][j];
				}
				array3[i][j]=multiplication;
				multiplication=0;
			}
		}
		System.out.println("Matrix Multiplication: ");
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(array3[i][j]+" "+" ");	
			}
			System.out.println();
		}		
		
	}

}
