import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JPanel;


public class CentipedePanel extends JPanel {
	
	final Dimension defaultDim;
	static final int TICK_SPEED = 25;
	GameMap gm;
	
	private Timer timer;
	
	public CentipedePanel() {
		this(new Dimension(800,600));
	}
	
	public CentipedePanel(Dimension dim) {
		defaultDim = dim;
		this.setPreferredSize(defaultDim);
		setUpTimer(TICK_SPEED);
	}
	
	
	
	
	
	private void tick() {
		//TODO: Shit that ticks
	}
	
	private void setUpTimer(int tickSpeed) {
		timer = new Timer(tickSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tick();
			}
		});
	}
	
	
	

}
