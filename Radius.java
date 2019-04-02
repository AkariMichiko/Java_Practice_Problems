package Method;
import java.util.Scanner;
public class Radius {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter values: ");
    double radius=input.nextDouble();	
	CalculateArea(radius);
	CalculateCircumference(radius);
	
}
	
	public static void CalculateArea(double radius)
	{
		Scanner input=new Scanner(System.in);
		double area= input.nextDouble();
		area=Math.PI*radius*radius;
		System.out.println("Area is: "+area);
	
	
	}
	
	public static void CalculateCircumference(double radius)
	{
		Scanner input=new Scanner(System.in);
		double perimeter= input.nextDouble(); 
	    perimeter=2*Math.PI*radius;
	    System.out.print("Perimeter is : "+perimeter);
	
}
}

