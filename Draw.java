import java.awt.Graphics;

import javax.swing.*;

public class Draw extends JPanel

{

  public void paint(Graphics g){

    g.drawLine(20,20,200,180);

    g.drawRect(50, 35, 150, 150);  

    g.drawOval(50,40,150,150);

 }

  

  public static void main(String[] args){

    JFrame f = new JFrame("Draw figures");

    f.getContentPane().add(new Draw());

    f.setSize(250, 250);

    f.setVisible(true);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}
