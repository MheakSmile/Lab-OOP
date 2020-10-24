
import java.util.Scanner;

public class Lab2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Please intput x,n : ");
        int x = input.nextInt();
        int n = input.nextInt();
        int a = 0;
        for (int i = 0; i <= n;i++){
            a = ((int) Math.pow(x, i))+a;
        }
        System.out.format("Output is %s: ",a);
    }
}
