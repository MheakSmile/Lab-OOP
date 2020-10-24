import java.util.Scanner;
public class lab3_5 {
    private int Peter;

	
	lab3_5(int n){
	this.Peter=n;
	}
	
	public void Wait(){
		Peter =Peter*2;
	}
	public void spray(){
		Peter= Peter-(Peter*10/100);
	}
	public int getRoaches(){
		return Peter;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
                int r = input.nextInt();
		lab3_5 p=new lab3_5(n);
                for(int i=0;i<r;i++){
			p.Wait();
			p.spray();		
	}
                System.out.println(p.getRoaches());
        }
}

