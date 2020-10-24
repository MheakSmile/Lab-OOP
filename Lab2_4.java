
import java.util.Scanner;


public class Lab2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate(e.g.,3%): ");
        float balance =input.nextFloat();
        float aR =input.nextFloat();
        float interest;
        interest = balance*(aR/1200);
        System.out.format("The interest is :%.5f ",interest);
    }
    
}
