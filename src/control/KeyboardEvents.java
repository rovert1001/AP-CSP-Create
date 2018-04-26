package control;

import processing.core.PApplet;
import processing.core.PConstants;

public class KeyboardEvents {

	public static boolean isAPressed = false;
	public static boolean isDPressed = false;
	public static boolean isWPressed = false;
	public static boolean isSPressed = false;
	public static boolean isShiftPressed = false;
	public static boolean isChanging = false;
	public static boolean isIPressed = false;
	public static boolean isKPressed = false;
	public static boolean isJPressed = false;
	public static boolean isLPressed = false;

	private static PApplet parent;


	KeyboardEvents(PApplet a) {
		parent = a;

	}
	
	public static void keyPresses() {
		
		if (parent.keyCode == PConstants.SHIFT) isShiftPressed = true;
		if (parent.keyCode == 'A' || parent.keyCode == PConstants.LEFT) isAPressed = true;
		if (parent.keyCode == 'D' || parent.keyCode == PConstants.RIGHT) isDPressed = true;
		if (parent.keyCode == 'W' || parent.keyCode == PConstants.UP) isWPressed = true;
		if (parent.keyCode == 'S' || parent.keyCode == PConstants.DOWN) isSPressed = true;
		if (parent.keyCode == 'I') isIPressed = true;
		if (parent.keyCode == 'K') isKPressed = true;
		if (parent.keyCode == 'J') isJPressed = true;
		if (parent.keyCode == 'L') isLPressed = true;
		
	}

	public static void keyReleases() {
		
		if (parent.keyCode == PConstants.SHIFT) isShiftPressed = false;
		if (parent.keyCode == 'A' || parent.keyCode == PConstants.LEFT) isAPressed = false;
		if (parent.keyCode == 'D' || parent.keyCode == PConstants.RIGHT) isDPressed = false;
		if (parent.keyCode == 'W' || parent.keyCode == PConstants.UP) isWPressed = false;
		if (parent.keyCode == 'S' || parent.keyCode == PConstants.DOWN) isSPressed = false;
		if (parent.keyCode == 'I') isIPressed = false;
		if (parent.keyCode == 'K') isKPressed = false;
		if (parent.keyCode == 'J') isJPressed = false;
		if (parent.keyCode == 'L') isLPressed = false;
		
	}
	


}
