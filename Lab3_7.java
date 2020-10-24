
import java.util.Scanner;

public class Lab_7 {
  
	public static boolean isValid(double side1,double side2,double side3){
		if(side1+side2>side3){
			return true;
		}
		else{
			return false;
		}
	}
	public static double area(double side1,double side2,double side3){
		double s=(side1+side2+side3)/2;
                double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))); 
                return area;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if (Lab_7.isValid(side1,side2,side3)) {
			System.out.printf("%.2f",Lab_7.area(side1,side2,side3));
		}
		else {
			System.out.println("0");
		}
	}

}

