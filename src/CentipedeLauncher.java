import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Map;

import javax.swing.JFrame;


public class CentipedeLauncher extends JFrame{
	
	public CentipedeLauncher() {
		Map<String,String> environMap= System.getenv();
		System.out.println(environMap.keySet());
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		CentipedePanel mop = new CentipedePanel(d);
		this.add(mop);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CentipedeLauncher();
	}

}
