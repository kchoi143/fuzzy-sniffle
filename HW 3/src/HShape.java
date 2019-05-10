import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;


public class HShape extends AbstractShape {
	
	int size;
	public HShape(int x, int y, Color c, int size) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.size = size;
	}

	@Override
	public void draw(Graphics g) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i == 1 & j == 0) || i == 1 & j == 2) {
				} else {
					g.setColor(c);
					g.drawRect(x+(i*(size/3)), y+(j*(size/3)), size/3, size/3);
					g.fillRect(x+(i*(size/3)), y+(j*(size/3)), size/3, size/3);	
				}
			}
		}
	}
	
	public Shape deepCopy() {
		int x = this.x;
		int y = this.y;
		Color c = this.c;
		int size = this.size;
		return new HShape(x, y, c, size);
	}
}