
import java.util.Scanner;

public class Lab3_6 {
	public static boolean isPalindrome(String s){
        int j = s.length() - 1; 
        for(int i=0;i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(j)) 
                return false;  
            j--;
        }
        return true; 
    } 
           public static void main(String[] args) {
               String s;
               Scanner input = new Scanner(System.in);
               s = input.nextLine();
       if (isPalindrome(s)) 
            System.out.println("0"); 
        else
            System.out.println("1"); 
    } 
}


