

class Rectangle{
    public
        int width,height;
        int x,y;
    Rectangle(int width,int hieght,int x,int y){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    double getArea(Rectangle a){
        double area;
        area = a.height*a.width;
        return area;
    }
}

class Line{ 
    public
        double x1,y1;
        double x2,y2;
    Line(double x1,double y1,double x2,double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    double getLong(Line a){
        double l = 0;
        l = Math.sqrt((Math.pow(a.x1-a.x2, 2))+(Math.pow(a.y1-a.y2, 2)));
        return l;
    }
}
public class Lab6_8 {
    static boolean onSegment(double x1,double y1,double x2,double y2,double x3,double y3){
        if(x2<=Math.max(x1, x3) && x2>=Math.min(x1, x3) && y2<=Math.max(x1, x3) && y2>=Math.min(y1, y3))
            return true;
        else return false;
    }
    static int orientation(double x1,double y1,double x2,double y2,double x3,double y3){
        double val = (y2-y1)*(x3-x2)-(x2-x1)*(y3-y2);
        if(val == 0)return 0;
        return (val > 0)? 1:2;
    }
    static boolean doIntersect(double ax1,double ay1,double ax2,double ay2,double bx1,double by1,double bx2,double by2){
        double o1 = orientation(ax1,ay1,ax2,ay2,bx1,by1);
        double o2 = orientation(ax1,ay1,ax2,ay2,bx2,by2);
        double o3 = orientation(bx1,by1,bx2,by2,ax1,ay1);
        double o4 = orientation(bx1,by1,bx2,by2,ax2,ay2);
        
        
        if(01 != o2 && o3 != o4)
            return true;
        
        
        if(o1 == 0 && onSegment(ax1,ay1,bx1,by1,ax2,ay2))
            return true;
        if(o2 == 0 && onSegment(ax1,ay1,bx2,by2,ax2,ay2))
            return true;
        if(o3 == 0 && onSegment(bx1,by1,ax1,ay1,bx2,by2))
            return true;
        if(o4 == 0 && onSegment(bx1,by1,ax2,ay2,bx2,by2))
            return true;
        return false;
    }
    static boolean doOverlaps(double p1x,double p1y,double r1x,double r1y,double p2x,double p2y,double r2x,double r2y){
        if (p1x >= r2x || p2x >= r1x) { 
            return false; 
        } 
  
         
        if (p1y <= r2y || p2y <= r1y) { 
            return false; 
        } 
  
        return true; 
    }
            
    static boolean contains(Line a,Rectangle b){
        double xmid = b.x+b.width/2;
        double ymid = b.y-b.height/2;
        double xx = b.width/2;
        double yy = b.height/2; 
        int c = 0;
        if(a.x1>xmid-xx||a.x1<xmid+xx&&a.y1>ymid-yy||a.y1<ymid+yy){
            if(a.x2>xmid-xx||a.x2<xmid+xx&&a.y2>ymid-yy||a.y2<ymid+yy){
                c=1;
            }
        } 
        else {
            c=0;
        }
        return c>0;
    }
    
    static boolean cross(Line a,Line b){   
        return doIntersect(a.x1,a.y1,a.x2,a.y2,b.x1,b.y1,b.x2,b.y2);
    }
    
    static boolean overlaps(Rectangle a,Rectangle b){
        double r1x = a.x+a.width;
        double r1y = a.y+a.height;
        double r2x = b.x+b.width;
        double r2y = b.y+b.height;
        return doOverlaps(a.x,a.y,r1x,r1y,b.x,b.y,r2x,r2y);
    }
    
    static double distance(Line a,Rectangle b){
        double x = (a.x1+a.x2)/2;
        double y = (a.y1+a.y2)/2;
        double xm = b.x+b.width/2;
        double ym = b.y-b.height/2;
        Line l = new Line(x,y,xm,ym); 
        return l.getLong(a);
    }
    public static void main(String[] args) {
        
    }
}