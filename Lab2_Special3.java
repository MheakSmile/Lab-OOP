
public class Lab2_Special3 {
    public static void main(String[] args) {
      double Sum = 0;
        for(int i=1;i<625;i++)
        {
            Sum += 1/(Math.sqrt(i)+Math.sqrt(i+1));
        }
        System.out.printf("%.2f",Sum);
    }
}

