import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			buildGUI();
		});
	}

	private static void buildGUI() {
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Viewer panel = new Viewer();
		frame.add(panel);

		frame.setVisible(true);

		DrawingModel model = new DrawingModel();
		Shape s1 = new FibonacciSquare(50, 50, Color.RED, 1, 12);
		Shape s2 = new FibonacciSquare(250, 50, Color.RED, 2, 12);
		Shape s3 = new FibonacciSquare(450, 50, Color.RED, 3, 12);
		Shape s4 = new FibonacciSquare(650, 50, Color.RED, 4, 12);
		model.addShape(s1);
		model.addShape(s2);
		model.addShape(s3);
		model.addShape(s4);
		Shape s5 = new HShape(200, 200, Color.GREEN, 200);
		model.addShape(s5);
		model.addView(panel);
	}
}