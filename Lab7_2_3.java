
public class Lab7_2_3 {
    public static void main(String[] args){
        C a1 = new C();
        C a2 = new C();
        System.out.println(a1.equals(a2));
    }
}

class C{
    int x;
    public boolean equals(C a){
        return this.x == a.x;
    }
}
