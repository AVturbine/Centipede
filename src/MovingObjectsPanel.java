import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JPanel;


public class MovingObjectsPanel extends JPanel {
	
	final Dimension defaultDim;
	static final int TICK_SPEED = 25;
	GameMap gm;
	private Timer timer;
	
	public MovingObjectsPanel() {
		this(new Dimension(800,600));
	}
	
	public MovingObjectsPanel(Dimension dim) {
		defaultDim = dim;
		this.setPreferredSize(defaultDim);
		setUpTimer(TICK_SPEED);
		makeGameMap();
	}
	private void makeGameMap() {
		gm = new CentipedeGameMap();
		
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
