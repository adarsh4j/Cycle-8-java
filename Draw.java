import java.awt.Graphics;

import javax.swing.*;

public class Draw extends JPanel

{
	
	public void paint(Graphics g){
		
		g.drawLine(20,10,50,44);
		
		g.drawRect(100, 80, 15, 20);  
		
		g.drawOval(50,60,40,32);
		
	}
	
	
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("Draw figures");
		
		f.getContentPane().add(new Draw());
		
		f.setSize(250, 250);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
