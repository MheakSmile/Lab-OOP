public class Lab7_3 {
    public static void main(String[] args){
        Fruit fruit = new GoldenDeliciousApple();
        Orange orange = new Orange();
        
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDeliciousApple);
        System.out.println(fruit instanceof MacintoshApple);
        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);
        //System.out.println(orange instanceof Apple);
        orange.makeOrangeJuice();
    }
}

class Fruit{
    
}

class Apple extends Fruit{
    public void makeApple(){
        System.out.println("makeApple");
    }
}

class Orange extends Fruit{
    public void makeOrangeJuice(){
        System.out.println("makeOrangeJuice");
    }
}

class GoldenDeliciousApple extends Apple{
    
}

class MacintoshApple extends Apple{
    
}
