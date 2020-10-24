import java.util.Scanner;
import java.util.ArrayList;

public class Lab9_ATOM {

    static int maxnow = 0;

    static void mtr(ArrayList<Integer> POWER, int max) {
        if (POWER.size() <= 1 && max > maxnow) {
            if (max > maxnow) {
                maxnow = max;
            }
            return;
        }

        for (int i = 0; i < POWER.size() - 1; i++) {
            ArrayList<Integer> MeteoNew = new ArrayList();

            for (int j = 0; j < POWER.size(); j++) {
                MeteoNew.add(POWER.get(j));
            }

            int max_2 = Math.abs(MeteoNew.get(i) - MeteoNew.get(i + 1));
            MeteoNew.remove(i + 1);
            MeteoNew.remove(i);
            mtr(MeteoNew, max+max_2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> POWER = new ArrayList();
        int a = sc.nextInt(), b;
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            POWER.add(b);
        }
        mtr(POWER, 0);
        System.out.println(maxnow);
    }
}