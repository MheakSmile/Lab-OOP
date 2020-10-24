
public class Lab7_2_1 {
    public static void main(String[] args){
        Object a1 = new A();
        Object a2 = new Object();
        System.out.println(a1);
        System.out.println(a2);
    }
}

class A{
    int x;
    public String toString(){
        return "A's x is " + x;
    }
}
