/**
 * This interface should describe the minimal 
 * information about a viewer needed for the DrawingModel to interact with it (probably just an update method).
 *
 */

import java.awt.Graphics;

public interface Shape {
	void draw(Graphics g);
//	Shape deepCopy();
}
