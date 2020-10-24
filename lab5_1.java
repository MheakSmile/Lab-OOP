import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
class data{
private final ArrayList<Integer> wow = new ArrayList();

    public void adddata(int Data) {
        wow.add(Data);
    }

    public void agv() {
        double num = 0, have = 0;
        for (Integer now : wow) {
            num += now;
            have++;
        }
        System.out.format("%.2f\n", num / have);
    }

    public void max() {
        int max = 0;
        for (Integer now : wow) {
            if (now > max) {
                max = now;
            }
        }
        System.out.format("%d\n", max);
    }

    public void min() {
        int min = 1000;
        for (Integer now : wow) {
            if (now < min) {
                min = now;
            }
        }
        System.out.format("%d\n", min);
    }

    public void re() {
        for(int i = 0; i < wow.size();i++){
            if((wow.get(i)%2) == 0){
                wow.remove(i);
                i--;
            }
        }
    }
    
    public void print(){
        for(int i = 0; i < wow.size();i++){
            System.out.print(wow.get(i) + " ");
        }
    }
}
public class lab5_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner gg = new Scanner(new File("E:\\number.txt"));
        data wow = new data();
        while (gg.hasNext()) {
                wow.adddata(Integer.parseInt(gg.next()));
        }
        wow.agv();
        wow.max();
        wow.min();
        wow.re();
        wow.print();
    } 
    }
    

