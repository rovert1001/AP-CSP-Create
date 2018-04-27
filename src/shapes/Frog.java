package shapes;

import processing.core.PApplet;

public class Frog {

	
	private static float frogHeight;

	float frogWidth;
	
	private PApplet parent;
	
	public Frog(PApplet a) {
		parent = a;
	
	}

	public void frog(float x, float y) {
		
		frogHeight = (float) (parent.pixelHeight / 25.0);
		frogWidth = (float) (parent.pixelWidth / 25.0 * main.Main.widthMultiplier);
		parent.fill(153, 255, 51);
		parent.rect(x, y, frogWidth, frogHeight);
		
	} 
	
}
