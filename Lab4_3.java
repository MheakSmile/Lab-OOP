
package lab4;

import java.util.Scanner;

public class Lab4_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        double[] A = new double[n];
        double A[] = {9,5,9,5,8};
//        for (int i = 0; i < n; i++) {
//            A[i] = in.nextDouble();
//        }
        AscendSortFreq a = new AscendSortFreq(A);
        double[] b = a.AscendSort(A);
        double[] c = a.SortCommuFreq(A);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < b.length; i++) {
        System.out.print(+c[i]+" ");
        }
    }
} 


class AscendSortFreq{
    
    double A[];
    
    AscendSortFreq(double[] A){
        this.A = new double[A.length];
        System.arraycopy(A, 0, this.A, 0, A.length);
        
    }
    public void sort(double[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j]>A[j+1]){
                    double temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
                
            }
        }
    }
    
    public double[] AscendSort(double[] A){
        
        double[] B = new double[1000];
        AscendSortFreq a = new AscendSortFreq(A);
        a.sort(A);
        int count = 1;
        int index = 0;
        for (int i = 1; i < A.length; i++) {
 
            
            if(A[i]!=A[i-1]){
                B[index++] = A[i-1];
                count++;
                
            }  
        }
        B[index] = A[A.length-1];
        
        double[] c = new double[count];
        System.arraycopy(B, 0, c, 0, count);
        
        return c;
    }
    
    public double[] SortCommuFreq(double[] A){
        
        double[] B = new double[1000];
        AscendSortFreq a = new AscendSortFreq(A);
        a.sort(A);
        int count = 1;
        int index = 0;
        int freeq = 1;
        for (int i = 1; i < A.length; i++) {
 
            if(A[i]!=A[i-1]){
                B[index++] = freeq;
                count++;
                
            } 
            freeq++;
        }
        B[index] = freeq;
        
        double[] c = new double[count];
        System.arraycopy(B, 0, c, 0, count);
        
        return c;
    }
    
    
}
    

