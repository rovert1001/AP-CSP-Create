package input;

import processing.core.PApplet;


import static main.Main.*;



public class Hopping {

	private static float frogYVel, frogXVel;
	
	private static PApplet parent;


	public Hopping(PApplet a) {
		parent = a;

		
	}




/*	private static boolean hasHopped = false;

	private static long deltaTime = 0;
	static long startTime;*/

	private static void yInput() {
		frogYVel = (float) (!isWPressed && !isSPressed || isWPressed && isSPressed ? 0.0 : (isSPressed ? 1.0 : -1.0));
//		frogY += frogYVel * (float) parent.pixelHeight / 25.0;
		

	}

	private static void xInput() {
		frogXVel = (float) (!isDPressed && !isAPressed || isDPressed && isAPressed ? 0.0 : (isDPressed ? 1.0 : -1.0));
		frogX += frogXVel * (float) (parent.pixelWidth / 25.0 * main.Main.widthMultiplier);
		

	}

	public static void frogMovement() {


		

		/*if (hasHopped && deltaTime < 1000) {

			deltaTime = System.currentTimeMillis() - startTime;

		}	*/
		

		//else if (!hasHopped && !(Math.abs(frogXVel) - Math.abs(frogYVel) == 0)) {
	//	yInput();
		xInput();
			
			//startTime = System.currentTimeMillis();
			//hasHopped = true;
		//}
		
		/*else {
			hasHopped = false;
		}
*/		


	}

}
