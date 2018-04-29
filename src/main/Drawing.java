package main;

import processing.core.PApplet;
import static main.Main.length;
import static main.Main.spacing;
import static main.Main.velocity;
import static main.Main.points;
import static main.Main.lives;
import main.Drawing;

import java.util.concurrent.ThreadLocalRandom;

public class Drawing {

	private static PApplet parent;
	
	private static float frogHeight, frogWidth;
	private static float[] deltaX = new float[8];
	
	Movement collider = new Movement(parent);
	
	public Drawing(PApplet a) {
		parent = a;

	}

	public void vehicleDraw(float velocity, float yLevel, float width, float spacing, int arrayPos) {
		parent.fill(66, 238, 244);
		for (float i = - width - spacing; i < (float) parent.pixelWidth * 12.0 / 10.0; i += width + spacing) {
			parent.rect(1 * i + deltaX[arrayPos], (float) parent.pixelHeight * yLevel / 10, width, (float) parent.pixelHeight / 25);
		}
		collider.collision(yLevel, width, spacing, arrayPos, deltaX);
		deltaX[arrayPos] += velocity;
		if (deltaX[arrayPos] >=  width + spacing && velocity > 0) deltaX[arrayPos] = 0;
		else if (deltaX[arrayPos] <= -spacing - width && velocity < 0) deltaX[arrayPos] = 0; 
		
		

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

			spacing[i] = ThreadLocalRandom.current().nextInt(150, 251);

		}

		for(int i = 0; i < velocity.length; i++) {

			velocity[i] = ThreadLocalRandom.current().nextInt(-2, 2);
			while (velocity[i] == 0) velocity[i] = ThreadLocalRandom.current().nextInt(-2, 2);

		}

		main.Main.frogX = parent.pixelWidth / 2;
		main.Main.frogY = parent.pixelHeight * 17 / 20;
		
		points++;
		
		if (lives < 5 && points != 0 && points % 5 == 0) lives ++;
	}
	
	
	public static void texts() {
		
		parent.fill(255);
		parent.text("Points: " + points, parent.pixelWidth / 20 , parent.pixelHeight * 19 / 20);
		parent.text("Lives: " + lives, parent.pixelWidth * 9 / 10, parent.pixelHeight * 19 / 20);
		
	}

}
