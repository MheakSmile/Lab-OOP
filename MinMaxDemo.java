
package lab4;
public class MinMaxDemo {
    public static void main(String[] args){
        int a[] ={-128, 65, -235, 99, 0, 26};
        MinMaxDemo c = new MinMaxDemo();
        int minIndex= c.findMinIdx(a);
        int maxIndex= c.findMaxIdx(a);
        System.out.println("min value is a["+minIndex+"]="+a[minIndex]);
        System.out.println("max value is a["+maxIndex+"]="+a[maxIndex]);
    }
    public int findMinIdx(int[] a){
        int k, minIdx=0;
        for(k=1;k<a.length;k++){
            if(a[k]<a[minIdx])
            {
            minIdx=k;
            }
        }
    return minIdx;
    }
        public int findMaxIdx(int[] a){
        int k, maxIdx=0;
        for(k=1;k<a.length;k++){
            if(a[k]>a[maxIdx])
            {
            maxIdx=k;
            }
        }
    return maxIdx;
    }

}