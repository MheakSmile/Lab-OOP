
import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i= input.nextInt();
			System.out.printf("%.4f",Es.Es(i));
		}
	}

class Es
{
	public static double Es(int i){
		double m=0;
		for(int j=1;j<=i;j++){
			m+=4*(Math.pow(-1,j+1)/((2*j)-1));
		}
		return m;
	}
}
