package shapes;

import processing.core.PApplet;

public class Frog {

	
	private static float frogHeight;

	float frogWidth;
	
	private PApplet parent;
	
	public Frog(PApplet a) {
		parent = a;
	
	}

	public void frog(int width, int height) {
		
		frogHeight = (float) (parent.pixelHeight / 25.0);
		frogWidth = (float) (parent.pixelWidth / 25.0 * main.Main.widthMultiplier);
		parent.fill(153, 255, 51);
		parent.rect(width, height, frogWidth, frogHeight);
		
	} 
	
}
