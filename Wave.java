import java.awt.*;
import javax.swing.*;
class Wave extends JPanel 
{
	int FACTOR = 200;
	int cycles;
	int points;
	double[] sines;
	int[] p;
	
	public static void main(String[] args) 
   {
		JFrame frame = new JFrame("wave pattern");
		frame.setBackground(Color.white);
		frame.setSize(500, 200);
		Wave w = new Wave();
		w.setCycles(10);
		frame.add(w);
		frame.setVisible(true);
	}
	public  void setCycles(int cycles) 
	{
		this.cycles = cycles;
		this.points = FACTOR * cycles * 2;
		this.sines = new double[points];
		for (int i = 0; i < points; i++) 
		{
			double radians = (Math.PI / FACTOR) * i;
			this.sines[i] = Math.sin(radians);
		}
	}
	public void paintComponent(Graphics g) 
	{
		int Width = getWidth();
		double step = (double) Width / (double) points;
		int Height = getHeight();
		p = new int[points];
		for (int i = 0; i < points; i++)
		{
			p[i] = (int) (sines[i] * Height / 2 * .95 + Height / 2);
		}
		for (int i = 1; i < points; i++) 
		{
			int x1 = (int) ((i - 1) * step);
			int x2 = (int) (i * step);
			int y1 = p[i - 1];
			int y2 = p[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}
	
}
