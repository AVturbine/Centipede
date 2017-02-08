import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


public class GameMap {

	private List<GameObject> objects;
	Image backgroundImage;
	
	public GameMap() {
		objects = new ArrayList();
		openBackgroundImage();
	}

	
	public void openBackgroundImage() {
		
	}
		

	public void add(GameObject go) {
		objects.add(go);
	} 	
}
