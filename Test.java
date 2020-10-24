//8.3
import java.awt.*;
import javax.swing.*;

abstract class AbstractDrawFuncion extends JPanel 
{
private Polygon p = new Polygon();
protected AbstractDrawFuncion ()
{
    drawFuncion();
    setBackground(Color.white);
}
public abstract double f(double x);
public void drawFuncion ()
{
    for(int x = -100; x<= 100; x++)
    {
        p.addPoint(x+200, 200-(int)f(x));
    }
}
@Override
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    g.drawLine(10, 200, 390, 200);
    g.drawLine(200, 30, 200, 390);
    g.drawLine(390, 200, 370, 190);
    g.drawLine(390, 200, 370, 210);
    g.drawLine(200, 30,190, 50);
    g.drawLine(200, 30, 210, 50);
    g.drawString("X", 370, 170);
    g.drawString("Y", 220, 40);
    g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
}
}
public class Test extends JFrame
{
            public Test()
            {
                getContentPane().setLayout(new GridLayout(3,2,5,5));
                getContentPane().add(new DrawSineA());
                getContentPane().add(new DrawSineB());
                getContentPane().add(new DrawSineC());
                getContentPane().add(new DrawSineD());
                getContentPane().add(new DrawSineE());
                getContentPane().add(new DrawSineF());
                getContentPane().add(new DrawSineG());
            }
public static void main(String[] args) 
{
        Test frame = new Test();
        frame.setSize(400, 400);
        frame.setTitle("Exercise 10.10");
        frame.setVisible(true);
 }
 }
class DrawSineA extends AbstractDrawFuncion{
    DrawSineA(){
    super();
}
    @Override
    public double f(double x){
        return Math.pow(x,2);
    }
}
class DrawSineB extends AbstractDrawFuncion{
    DrawSineB(){
    super();
}
    @Override
    public double f(double x){
        return Math.sin(x)*50;
    }
}
class DrawSineC extends AbstractDrawFuncion{
    DrawSineC(){
    super();
}
    @Override
    public double f(double x){
        return Math.cos(x)*100;
    }
}
class DrawSineD extends AbstractDrawFuncion{
    DrawSineD(){
    super();
}
    @Override
    public double f(double x){
        return Math.tan(x);
    }
}
class DrawSineE extends AbstractDrawFuncion{
    DrawSineE(){
    super();
}
    @Override
    public double f(double x){
        return Math.cos(x)+(5*(Math.sin(x)));
    }
}
class DrawSineF extends AbstractDrawFuncion{
    DrawSineF(){
    super();
}
    @Override
    public double f(double x){
        return (5*Math.cos(x))+Math.sin(x);
    }
}
class DrawSineG extends AbstractDrawFuncion{
    DrawSineG(){
    super();
}
    @Override
    public double f(double x){
        return Math.log(x)+Math.pow(x,2);
    }
}