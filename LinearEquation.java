
import java.util.*;
class Linear {
    
    private float a, b, c, d, e, f;
    
    void get(float a, float b, float c, float d, float e, float f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    boolean isSolvable() {
        float chack = (a * d) - (b * c);
        if (chack == 0.0) {
            return false;
        } else {
            return true;
        }
    }

    float getx() {
        float x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        return x;
    }

    float gety() {
        float y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return y;
    }
}
public class LinearEquation {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        float a = x.nextFloat(), b = x.nextFloat(), c = x.nextFloat(), d = x.nextFloat(), e = x.nextFloat(), f = x.nextFloat();
        
        Linear xx = new Linear();
        
        xx.get(a, b, c, d, e, f);
        boolean chack = xx.isSolvable();
        if (chack == true) {
            System.out.print("x is" +" "+ xx.getx() + "and y is" +" "+ xx.gety());
        } else {
            System.out.print("The equation has no solution");
        }
    }
}


