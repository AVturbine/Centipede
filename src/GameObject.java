import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


public abstract class GameObject {
	protected double speed, x,y,width, height, health, damage;
	//public static final int NORTH = 1, SOUTH = 3, EAST = 2,WEST = 4;
	protected double direction; // direction from 0 to 360
	protected Color color;
	protected BufferedImage img;
	public Rectangle boundingRect;
	
	public void move() {
		x+=speed*Math.cos(direction);
		y+=speed*Math.sin(direction);
	}
	
	public Rectangle getBoundingRect() {
		return boundingRect;
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, (int)(x), (int)(y), null);
	}
	
	protected void loadImage(String imageName) {
		try {
			URL url = getClass().getResource("res/" + imageName + ".png");
			img = ImageIO.read(url);
			Log.log("Successfully loaded front img "+ imageName, Log.VERBOSE);
		} catch (IOException e) {
			Log.log("Problem opening the front resource: filename is " + imageName, Log.VERBOSE);
			e.printStackTrace();
		}
	}
	
	public boolean isColliding (Rectangle otherRect) {
		
	}

}
