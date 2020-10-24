import java.util.*;
public class Complex {
    public double r, i;
Complex(double r, double i) {
this.r = r; 
this.i = i;
}
Complex(Complex c) {
this(c.r, c.i);
}
public void add(Complex c) {
    r += c.r;
    i += c.i;
    
}
public void sub(Complex d) {
    r -= d.r;
    i -= d.i;
}
   public void mul(Complex e) {
        r *= e.r;
        i *= e.i;
    }

    public void div(Complex f) {
        r /= f.r;
        i /= f.i;
    }
public void print() {
System.out.println(r +" "+ i);
}
}
class ComplexTest {
public static void main(String args[]) {
Complex a = new Complex(1.0, 2.0);
Complex b = new Complex(3.0, 4.0);
Complex c = new Complex(a);
Complex d = new Complex(a);
Complex e = new Complex(a);
Complex f = new Complex(a);
c.add(b);
d.sub(b);
c.print();
d.print();
e.mul(b);
e.print();
f.div(b);
f.print();
}
}
