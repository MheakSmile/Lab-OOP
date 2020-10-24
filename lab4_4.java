
package lab4;

public class lab4_4 {
    public static void main(String[] args) {
        Coin c1 = new Coin("H",1);
        Coin c2 = new Coin(c1);
        Coin c3 = new Coin("T",5);
        Coin c4 = new Coin(c3);
        
        for (int i = 0; i < 20; i++) {
            c1.flip();
            c2.reverse();
            c3.flip();
            c4.reverse();
        }
        System.out.println("");
        System.out.println("C1 = "+c1.side);
        System.out.println("C2 = "+c2.side);
        c1.equals(c2);
        System.out.println("C3 = "+c3.side);
        System.out.println("C4 = "+c4.side);     
        c3.equals(c4);
    }
}

class Coin{
    
    public String side;
    public int value;
    String[] list = {"H","T"};
    
    Coin(){
        side = "H";
        value = 0;
    }
    
    Coin(String side, int value){
        this.side = side;
        this.value = value;
    }
    
    Coin(Coin a){
        side = a.side;
        value = a.value;
    }
    
    public void flip(){
        
        int n = (int)(Math.random()*10)%2;
        side = list[n];
    
    }
    
    public void reverse(){
        if("H".equals(side)){
            side = "T";
        }
        else{
            side = "H";
        }
    }
    
    public void equals(Coin c){
        if(side.equals(c.side) && value == c.value){
            System.out.println("เท่า");
        }
        else{
            System.out.println("ไม่เท่า");
        }
    }
}
