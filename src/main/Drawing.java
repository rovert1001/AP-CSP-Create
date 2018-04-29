package main;

import processing.core.PApplet;
import static main.Main.length;
import static main.Main.spacing;
import static main.Main.velocity;

import java.util.concurrent.ThreadLocalRandom;

public class Drawing {

	private static PApplet parent;
	
	private static float frogHeight, frogWidth;

	public Drawing(PApplet a) {
		parent = a;

	}

	public void vehicleDraw(float yLevel, float width, float spacing) {
		parent.fill(153, 255, 51);
		for (double i = 0; i < (float) parent.pixelWidth * 12.0 / 10.0; i += width + spacing) {
			parent.rect(3, (float) parent.pixelHeight * yLevel / 10, width /*parent.pixelWidth*/, (float) parent.pixelHeight / 25);
		}

	}

	public void frog(float x, float y) {

		frogHeight = (float) (parent.pixelHeight / 25.0);
		frogWidth = (float) (parent.pixelWidth / 25.0 * main.Main.widthMultiplier);
		parent.fill(153, 255, 51);
		parent.rect(x, y, frogWidth, frogHeight);

	} 

	public static void reset() {

		for(int i = 0; i < length.length; i++) {

			length[i] = ThreadLocalRandom.current().nextInt(75, 351);

		}

		for(int i = 0; i < spacing.length; i++) {

			spacing[i] = ThreadLocalRandom.current().nextInt(175, 351);

		}

		for(int i = 0; i < velocity.length; i++) {

			velocity[i] = ThreadLocalRandom.current().nextInt(175, 351);

		}

		main.Main.frogX = parent.pixelWidth / 2;
		main.Main.frogY = parent.pixelHeight * 17 / 20;

	}

}
