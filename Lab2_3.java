import java.util.*;
public class Lab2_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ponts foa r triangle : ");
    float x1 = input.nextFloat();
    float y1 = input.nextFloat();
    float x2=  input.nextFloat();
    float y2 = input.nextFloat();
    float x3 = input.nextFloat();
    float y3 = input.nextFloat();
    float side1,side2,side3,area,s;
    side1 =(float)Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    side2 =(float)Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
    side3 =(float)Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
    s =(side1+side2+side3)/2;
    area =(float)Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.format("The area of the triangle is: %.1f",area);
   
    
    }
    
}
