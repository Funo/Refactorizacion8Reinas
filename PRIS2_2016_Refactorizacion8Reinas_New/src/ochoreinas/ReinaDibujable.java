package ochoreinas;

import java.awt.Graphics;

public class ReinaDibujable extends Reina {

	ReinaDibujable(int c, ReinaDibujable n) {
		super(c, n);
	}
	
	public void paint(Graphics g) {
		// primero dibuja la vecina vecina
		if (vecina != null)
			vecina.paint(g);
		// despues a ella misna
		// x, y is upper left corner
		dibujarCorona(g);
	}
	
	public void dibujarCorona(Graphics g){
		
		int x = (fila - 1) * 50 + 10;
		int y = (columna - 1) * 50 + 40;
		
		g.drawLine(x + 5, y + 45, x + 45, y + 45);
		g.drawLine(x + 5, y + 45, x + 5, y + 5);
		g.drawLine(x + 45, y + 45, x + 45, y + 5);
		g.drawLine(x + 5, y + 35, x + 45, y + 35);
		g.drawLine(x + 5, y + 5, x + 15, y + 20);
		g.drawLine(x + 15, y + 20, x + 25, y + 5);
		g.drawLine(x + 25, y + 5, x + 35, y + 20);
		g.drawLine(x + 35, y + 20, x + 45, y + 5);
		g.drawOval(x + 20, y + 20, 10, 10);
	}

}
