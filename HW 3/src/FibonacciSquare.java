/**
 * The two classes FibonacciSquare and HShape should also have a method that returns a deep copy 
 * of its calling object (this is so that the model can return a deep copy of its lists of shapes. See below). 
 * Do so by implementing a method such as public Shape deepCopy() whose declaration could be written in the Shape interface. 
 * And of course, make sure that the copy is a deep copy. 
 */
import java.awt.Color;
import java.awt.Graphics;

public class FibonacciSquare extends AbstractShape {

	int quadrant, n;
	/**
	 * 
	 * @param x, y (x, y) coordinates of upper-left corner of shape
	 * @param quadrant corresponds to quadrant of a full circle
	 * @param n refers to the nth fibonacci number; the length of the square
	 */
	public FibonacciSquare(int x, int y, Color c, int quadrant, int n) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.quadrant = quadrant;
		this.n = n;
	}
	
	public int FibonacciNumber(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		for (int i = 0; i < n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n = n1;
	}
	@Override
	public void draw(Graphics g) {
		// draw a square
		n = FibonacciNumber(n);
		g.setColor(c);
		g.drawRect(x, y, n, n);
		switch (quadrant) {
		case 1:
			g.drawArc(x-n, y, n*2, n*2, 0, 90);
			break;
		case 2:
			g.drawArc(x, y, n*2, n*2, 90, 90);
			break;
		case 3:
			g.drawArc(x, y-n, n*2, n*2, 180, 90);
			break;
		case 4:
			g.drawArc(x-n, y-n, n*2, n*2, 270, 90);
			break;
			
		}
	}
	
	public Shape deepCopy() {
		int x = this.x;
		int y = this.y;
		Color c = this.c;
		int quadrant = this.quadrant;
		int n = this.n;
		return new FibonacciSquare(x, y, c, quadrant, n);
	}
}
