import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import javax.swing.Timer;

public class Lab10_4 extends JFrame {

    Lab10_4() {
        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(new RaceCar(4));
        panel.add(new RaceCar(10));
        panel.add(new RaceCar(20));
        panel.add(new RaceCar(200));
        add(panel);

    }

    public static void main(String[] args) {
        Lab10_4 frame = new Lab10_4();
        frame.setTitle("RaceCar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

}

class RaceCar extends JPanel {

    private int xBase = 0, speed;
    private Timer timer = new Timer(10, new Listener());

    public RaceCar(int speed) {
        this.speed = speed;
        timer.start();
        
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.isControlDown() && e.getKeyCode() == 61) {
                    if (timer.getDelay() > 5) {
                        timer.setDelay(timer.getDelay() - 5);
                    }
                } else if (e.isControlDown() && e.getKeyCode() == 45) {
                    timer.setDelay(timer.getDelay() + 1);
                }
            }
        });
    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int yBase = getHeight();
        if (xBase > getWidth()) {
            xBase = -20;
        } else {
            xBase += speed;
        }

        g.setColor(Color.BLACK);
        g.fillOval(xBase + 10, yBase - 10, 10, 10);
        g.fillOval(xBase + 30, yBase - 10, 10, 10);

        g.setColor(Color.GREEN);
        g.fillRect(xBase, yBase - 20, 50, 10);
        g.setColor(Color.RED);
        Polygon polygon = new Polygon();
        polygon.addPoint(xBase + 10, yBase - 20);
        polygon.addPoint(xBase + 20, yBase - 30);
        polygon.addPoint(xBase + 30, yBase - 30);
        polygon.addPoint(xBase + 40, yBase - 20);
        g.fillPolygon(polygon);
    }
}