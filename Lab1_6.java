class RegularPolygon{
    private int n = 3;
    private double side = 1,x = 0,y = 0;
    
    RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
        getPerimeter(n,side);
    }
    RegularPolygon(int n,double side,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
        getArea(n,side,x,y);
    }
    private void getPerimeter(int n,double side){
        System.out.println(n*side);
    }
    private void getArea(int n,double side,double x,double y){
        System.out.println((n*side*side) / (4 * (Math.tan(Math.PI/n))));
    }
}
public class Lab1_6 {
    public static void main(String[] args) {
        RegularPolygon Perimeter = new RegularPolygon(6,4);
        RegularPolygon Area = new RegularPolygon(10,4,5.6,7.8);
    }
}
