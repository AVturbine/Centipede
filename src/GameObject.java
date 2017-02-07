import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;


public class GameObject implements MovingObject {
	private double speed, x,y,width, height, health, damage;
	//public static final int NORTH = 1, SOUTH = 3, EAST = 2,WEST = 4;
	
	private double direction;
	private Color color;
	private BufferedImage img;
	
	public GameObject(double x, double y, double wid, double ht) {
		speed = 0; 
		
	}
	
	@Override
	public void move() {
		x+=speed*Math.cos(direction);
	}
	
	@Override
	public Rectangle getBoundingRect() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
