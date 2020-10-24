
import java.util.Scanner;

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int b = 1 ; b <= a ; b++){
            for (int c = 1; c <= a; c++){
                int d = c*b;
                String e = Integer.toString(d);
                if (d == 1){
                    e = "";
                }
                System.out.format("%3s ", e);
            }
        System.out.format("\n");
        }
    } 
}
