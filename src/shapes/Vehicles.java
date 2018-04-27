package shapes;

import processing.core.PApplet;

public class Vehicles {

	private PApplet parent;

	public Vehicles(PApplet a) {
		parent = a;

	}

	public void vehicles(float yLevel, float width, float spacing) {
		parent.fill(153, 255, 51);
		for (double i = 0; i < (float) parent.pixelWidth * 12.0 / 10.0; i += width + spacing) {
			parent.rect(3, (float) parent.pixelHeight * yLevel / 10, width, (float) parent.pixelHeight / 25);
		}
		
	}

}
