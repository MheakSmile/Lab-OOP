import java.util.*;
public class Lab2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount : ");
        float money =input.nextFloat();
        float interest =0;
        for(int i=1;i<=6;i++){
            interest =(float)((money+interest)*(1.0+0.00417));
        }
        System.out.format("The sixth month,the accout value is :%.2f",interest);
    }

   
}

