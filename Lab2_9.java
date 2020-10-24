import java.util.*;
public class Lab2_9 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 0,c = 0,i = 1;
        while(true){
            int a = input.nextInt();
            if (a == 0){
                break;
            }
            if (a > b){
                b = a;
            }
            if (b != c){
                i = 0;
                c = b;
            }
            if (b == c && c == a){
                i += 1;
            }
        }
        System.out.format("%s %s \n", b,i);
    }   
}