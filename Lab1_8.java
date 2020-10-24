import java.util.Scanner;

class square {

    private double YTop, YBot, XLeft, XRight;
    private int ADS = 0;
    private String CC;

    public void A(double x, double y, double w, double h) {
        this.YTop = y + (h / 2);
        this.YBot = y - (h / 2);
        this.XRight = x + (w / 2);
        this.XLeft = x - (w / 2);
    }

    public void B(double x, double y, double w, double h, square  c) {
        double Y_Top, Y_Bot, X_Left, X_Right;
        Y_Top = y + (h / 2);
        Y_Bot = y - (h / 2);
        X_Left = x + (w / 2);
        X_Right = x - (w / 2);

        this.ADS += fix(Y_Top, X_Left, c);
        this.ADS += fix(Y_Top, X_Right, c);
        this.ADS += fix(Y_Bot, X_Left, c);
        this.ADS += fix(Y_Bot, X_Right, c);

        Ads(Y_Top, Y_Bot, X_Left, X_Right, c);
    }

    public int fix(double x, double y, square  c) {
        if (x >= c.XLeft && x <= c.XRight && y <= c.YTop && y >= c.YBot) {
            return 1;
        } else {
            return 0;
        }
    }

    public void Ads(double Y_Top, double Y_Bot, double X_Left, double X_Right, square  c) {
        if (Y_Top == c.YTop && Y_Bot == c.YBot && X_Left == c.XLeft && X_Right == c.XRight) {
            CC = "Overlap";
        } else if (ADS == 4) {
            
            CC = "Inside";
        } else if (ADS > 0) {
            CC = "Overlap";
        } else {
            CC = "Unrelated";
        }
    }

    public String Answer() {
        return CC;
    }
}
public class Lab1_8 {
     public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        square box = new square();
        System.out.print("Enter r1's center x-, y-coordintes, width, and heigth: ");
        box.A(gg.nextDouble(), gg.nextDouble(), gg.nextDouble(), gg.nextDouble());
        System.out.print("Enter r2's center x-, y-coordintes, width, and heigth: ");
        box.B(gg.nextDouble(), gg.nextDouble(), gg.nextDouble(), gg.nextDouble(), box);
        System.out.format("r2 is %s r1 \n", box.Answer());

    }

}
