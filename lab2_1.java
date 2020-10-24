 import java.awt.Dialog;
import java.util.*;
import javax.swing.JOptionPane;
public class lab2_1 {

    public static void main(String[] args) {
  //1.1
    String str = JOptionPane.showInputDialog(null, "Please Enter Fahrenheit",
"Dialog Title", JOptionPane.QUESTION_MESSAGE);
    double f = Double.parseDouble(str);
    double C =((f-32.0)*5.0)/9.0;
    JOptionPane.showMessageDialog(null,C);
}
}

    
   

