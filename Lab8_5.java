
import java.lang.*;
public class Lab8_5 {
    public static abstract class GeometricObject {
        private String color = "white";
        private boolean filled;
        protected GeometricObject() {
            
        }
        protected GeometricObject(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
        }
    public static class Circle extends GeometricObject implements Comparable<Circle> {
        private int radius;
        public Circle(){
        }
        public Circle(int radius){
            this.radius = radius;
        }
        public int getRadius(){
            return this.radius;
        }
        public double getArea(){
            return radius*radius*Math.PI;
        }
        public double getPerimeter(){
            return 2*radius*3.14;
        }  
        
        @Override
        public int compareTo(Circle o) {
            if(this.radius == o.radius)
                return 0;
            else if(this.radius >o.radius)
                return 1;
            else
                return -1;
        }
        public boolean equals(Circle p){
            return this.radius == p.radius;
        }
    }
    
    public static class ComparableCircle extends Circle implements Comparable<Circle>{
        private double radius;
        public ComparableCircle(){
        
        }
        public ComparableCircle(int radius){
            this.radius = radius;
        }
        @Override
        public double getArea() {
            return radius*radius*Math.PI;
        }

        @Override
        public int compareTo(Circle o) {
            if(getArea()==o.getArea()) return 0;
            else if(getArea()>o.getArea()) return 1;
            else return -1;
        }
    }
    public static class Rectangle extends GeometricObject implements Comparable<Rectangle>{
        private double width;
        private double height;
        public Rectangle(){
        }
        public Rectangle(double width,double height){
            this.height = height;
            this.width = width;
        }
        public double getArea(){
            return width*height;
        }
        public double getPerimeter(){
            return width*2+height*2;
        }
        @Override
        public int compareTo(Rectangle o) {
            if(getArea() == o.getArea())
                return 0;
            else if(getArea()>o.getArea())
                return 1;
            else
                return -1;
        }
        public boolean equals(Rectangle p){
            return getArea() == p.getArea();
        }
    }
    
    public static class Octangle extends GeometricObject implements Comparable<Octangle>,Cloneable{
        private double side;
        public Octangle(){
        }
        public Octangle(double side){
            this.side = side;
        }
        public double getArea(){
            return (2+4/Math.sqrt(2))*side*side;
        }
        public double getPerimeter(){
            return side*8;
        }
        @Override
        public GeometricObject clone() throws CloneNotSupportedException 
        { 
            return (GeometricObject)super.clone(); 
        } 
        @Override
        public int compareTo(Octangle o) {
            if(getArea() == o.getArea())
                return 0;
            else if(getArea()>o.getArea())
                return 1;
            else
                return -1;
        }
        public boolean equals(Octangle p){
            return getArea() == p.getArea();
        }
    } 
    
    public static void main(String[] args) throws CloneNotSupportedException {
        GeometricObject objectc1 = new Circle(5);
        GeometricObject objectr1 = new Rectangle(5,3);
        GeometricObject objecto1 = new Octangle(10);
        GeometricObject objectc2 = new Circle(5);
        GeometricObject objectr2 = new Rectangle(4,4);
        GeometricObject objecto2 = ((Octangle)objecto1).clone();
        ((Octangle)objecto2).side=5;
        
        display(objectc1);
        System.out.println(((Circle)objectc1).equals(((Circle)objectc2)));
        System.out.println(((Circle)objectc1).compareTo(((Circle)objectc2)));
        
        display(objectr1);
        System.out.println(((Rectangle)objectr1).equals(((Rectangle)objectr2)));
        System.out.println(((Rectangle)objectr1).compareTo(((Rectangle)objectr2)));
        
        display(objecto1);
        System.out.println(((Octangle)objecto1).equals(((Octangle)objecto2)));
        System.out.println(((Octangle)objecto1).compareTo(((Octangle)objecto2)));
        
        Circle c1 = new ComparableCircle(15);
        Circle c2 = new ComparableCircle(10);
        int check = ((ComparableCircle)c1).compareTo((ComparableCircle)c2);
        if(check > 0) System.out.println("Circle 1 biger than Circle 2");
        else if(check < 0) System.out.println("Circle 1 smaller than Circle 2");
        else System.out.println("Circle 1 equals Circle 2");
    } 
    public static void display(GeometricObject object){
        System.out.println();
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());
    }  
}