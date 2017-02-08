
public class Mushroom extends GameObject {

	public Mushroom(double x, double y, int scale) {
		width = scale*15;
		height = scale*15;
		speed = 0;
		loadImage("shroom");
	}

	@Override
	public void move() {
		//mushrooms don't move, fucktards
		return;
	}
}
