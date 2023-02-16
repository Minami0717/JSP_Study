import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloJavaApplet extends JApplet {
	@Override
	public void init() {
		Container container = getContentPane();
		container.add(new JLabel("Hello, Java",SwingConstants.CENTER));
	}
}
