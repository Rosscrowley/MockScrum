import javax.swing.JFrame;

public class NewFrame {

	JFrame NewWindow = new JFrame();

	NewFrame() {

		NewWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NewWindow.setResizable(false);
		NewWindow.setVisible(true);
		NewWindow.setSize(600, 400);
		NewWindow.setLayout(null);
		
	}
}
