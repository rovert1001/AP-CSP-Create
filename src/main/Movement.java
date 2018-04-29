package main;

import processing.core.PApplet;

import static main.Main.*;
import static main.Drawing.reset;

public class Movement {

	private static float frogYVel, frogXVel;

	private static PApplet parent;

	private static boolean hasHopped = false;

	private static long deltaTime;
	private static long startTime;
	
	private static boolean xMatch = false, yMatch = false;
	private static float frogWidth;

	public Movement(PApplet a) {
		parent = a;

	}


	public void frogMovement() {

		frogYVel = (float) (!isWPressed && !isSPressed || isWPressed && isSPressed ? 0.0 : (isSPressed ? 1.0 : -1.0));
		frogXVel = (float) (!isDPressed && !isAPressed || isDPressed && isAPressed ? 0.0 : (isDPressed ? 1.0 : -1.0));

		if (hasHopped && deltaTime < 500) {
			deltaTime = System.currentTimeMillis() - startTime;
		}	

		else if (!hasHopped && !(Math.abs(frogXVel) - Math.abs(frogYVel) == 0)) {
			frogY += frogYVel * (float) parent.pixelHeight / 20.0;
			frogX += frogXVel * (float) (parent.pixelWidth / 15.0 * main.Main.widthMultiplier);

			startTime = System.currentTimeMillis();
			hasHopped = true;
			deltaTime = 0;
		}

		else {
			hasHopped = false;
		}


	}

	public void collision(float yLevel, float width, float spacing,  int arrayPos, float[] deltaX) {
		
		frogWidth = (float) (parent.pixelWidth / 25.0 * main.Main.widthMultiplier);


		for (double i = -width - spacing; i < (float) parent.pixelWidth * 12.0 / 10.0; i += width + spacing) {

			xMatch = (frogX >= 1 * i + deltaX[arrayPos] - frogWidth && frogX <= 1 * i + deltaX[arrayPos] + frogWidth) ? true : false;
			yMatch = (frogY >= (float) parent.pixelHeight * yLevel / 10 && frogY <= (float) parent.pixelHeight * yLevel / 10) ? true : false;
			

			
			if (xMatch && yMatch && lives > 0) {
				lives--;
				reset();
				points--;
			}
			else if (xMatch && yMatch) System.exit(0);

		}

	}

}
