package lab9;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
 
class A extends JFrame{
JPanel p1=new JPanel(new GridLayout(3,2));
JPanel p2=new JPanel(new FlowLayout(FlowLayout.RIGHT));

JLabel jbname = new JLabel("US Dollars");
JTextField jtdolla = new JTextField(10);
JLabel jbname2 = new JLabel("Cannada convert");
JTextField jtcannada = new JTextField(10);
JButton jbtok = new JButton("Convert");
    A(){

p1.add(jbname);
p1.add(jtdolla);
p1.add(jbname2);
p1.add(jtcannada);
p2.add(jbtok);
 add(p1, BorderLayout.CENTER);
 add(p2,BorderLayout.SOUTH);     
add(p1);
jbtok.addActionListener(new ButtonListener());
}

class ButtonListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
    float a = Float.parseFloat(jtdolla.getText());
    a = (float)(a*1.5);
         jtdolla.setEnabled(false);
         jtcannada.setText(String.format("%.2f", a));
    if (e.getSource() == jbtok) {
              jtcannada.setHorizontalAlignment(JTextField.RIGHT);
               jtdolla.setHorizontalAlignment(JTextField.RIGHT);
            }
}
}
}

public class Lab9_4 extends JFrame {
public static void main(String[] args) {
JFrame a = new A();
a.setSize(500,200);
a.setVisible(true);
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

