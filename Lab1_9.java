import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class PN {

    public int[] form(int a[]) {
        Arrays.sort(a);
        return a;
    }

    public int search(int a[]) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    break;
                } else if (a[i] % j != 0 && j == a[i] - 1) {
                    return a[i];
                }
            }
        }
        return -1;
    }
}
public class Lab1_9 {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        ArrayList<Integer> eiei = new ArrayList<>();
        int a;
        while (true) {
            a = gg.nextInt();
            if (a == 0) {
                break;
            }
            eiei.add(a);
        }
        int so[] = new int[eiei.size()];
        for (int i = 0; i < eiei.size(); i++) {
            so[i] = eiei.get(i);
        }

        PN wow = new PN();
        wow.form(so);
        System.out.println(wow.search(so));
    }
}
