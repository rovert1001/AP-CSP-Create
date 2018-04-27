package input;

import processing.core.PApplet;


import static main.Main.*;

public class Hopping {

	private static float frogYVel, frogXVel;

	private static PApplet parent;

	private static boolean hasHopped = false;

	private static long deltaTime;
	private static long startTime;


	public Hopping(PApplet a) {
		parent = a;

	}


	public static void frogMovement() {

		frogYVel = (float) (!isWPressed && !isSPressed || isWPressed && isSPressed ? 0.0 : (isSPressed ? 1.0 : -1.0));
		frogXVel = (float) (!isDPressed && !isAPressed || isDPressed && isAPressed ? 0.0 : (isDPressed ? 1.0 : -1.0));

		if (hasHopped && deltaTime < 1000) {
			deltaTime = System.currentTimeMillis() - startTime;
		}	


		else if (!hasHopped && !(Math.abs(frogXVel) - Math.abs(frogYVel) == 0)) {
			frogY += frogYVel * (float) parent.pixelHeight / 20;
			frogX += frogXVel * (float) (parent.pixelWidth / 25.0 * main.Main.widthMultiplier);

			startTime = System.currentTimeMillis();
			hasHopped = true;
			deltaTime = 0;
		}

		else {
			hasHopped = false;
		}


	}

}
