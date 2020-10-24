
import java.util.Scanner;



public class Lab2_Special1 {
        public static void main(String[] args){
        double a,b,c,d,e,f;
        System.out.println("Enter a b c d e f: ");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        if((a*d)-(b*c) == 0)
        {
            System.out.println("The equation has no solution");
            System.exit(0);
        }
        else{
            System.out.println("x is " + ((e*d)-(b*f))/((a*d)-(b*c))+ " y is " + ((a*f)-(e*c))/((a*d)-(b*c)));
        }
    }
}
