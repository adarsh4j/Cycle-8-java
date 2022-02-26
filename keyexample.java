import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
public class keyexample extends KeyAdapter{  
	public static void main(String[] args) {  
		JFrame f = new JFrame("Keyboard");
		f.setSize(300,300);  
		keyexample k = new keyexample();
		f.addKeyListener(k);
		JPanel p = new JPanel();
		l = new JLabel();
		p.add(l);
		f.add(p);
		f.setVisible(true); 
	}  	
	static JLabel l; 
	public void keyPressed(KeyEvent e) {  
		l.setText("key is pressed");  
	}  
	public void keyReleased(KeyEvent e) {  
		l.setText("Key is released");  
	}  
	public void keyTyped(KeyEvent e) {  
		l.setText("Typing");  
	}  
	
}


