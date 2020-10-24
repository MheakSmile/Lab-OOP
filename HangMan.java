import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.bind.Marshaller.Listener;
public class HangMan extends JFrame{
    public HangMan(){
        add(new drowPanel(0,0));
    }
    class drowPanel extends JPanel {
        int x = 20,y = 40, i = 200, o = 0,l = 120;
private Timer timer = new Timer(10,new HangMan.drowPanel.wowListener());
        drowPanel(int i,int l){
            this.i = i;
            this.l = l;
            timer.start();
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(160 - i == 200 || 160 + l == 120){
                o = 1;
            }
            if(160 - i == 120 || 160 + l == 200){
                o = 0;
            }
            g.drawArc(20, 220, 80, 40, 0, 180);
            g.drawLine(20 + 40, 220, 20 + 40, 20);
            g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);
            g.drawLine(20 + 40 + 100, 20, 20 + 40 + 100 , 40);

            int radius = 20;

            g.drawOval(20 + 40 + 100 - radius , 40, 2 * radius, 2 * radius);

            g.drawLine(20 + 40 + 100  - (int)  (radius * Math.cos(Math.toRadians(45))),
                    40 + radius  + (int) (radius * Math.sin(Math.toRadians(45))),
                    20 + 40 + 100 - 60 , 40 + radius + 60);
            g.drawLine(20 + 40 + 100  + (int) (radius * Math.cos(Math.toRadians(45))),
                    40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                    20 + 40 + 100 + 60 , 40 + radius + 60);
            g.drawLine(20 + 40 + 100, 40 + 2 * radius,
                    20 + 40 + 100 , 40 + radius + 80);
            g.drawLine(20 + 40 + 100  , 40  + radius + 80 , 20 + 40 + 100 - 40 - i , 40 + radius
                    + 80 + 40 );
            g.drawLine(20 + 40 + 100   , 40 + radius + 80, 20 + 40 + 100 + 40 - i, 40 + radius
                    + 80 + 40);
            if(o == 0){
                i--;
                l--;
            }
            if(o == 1){
                i++;
                l++;
            }
        }
        class wowListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        }
    }
    public static void main(String[] args) {
        HangMan eiei = new HangMan();
        eiei.setSize(300, 300);
        eiei.setVisible(true);
        eiei.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}