package main;

import processing.core.PApplet;

import static main.Drawing.reset;


public class Main extends PApplet{
	
	Drawing drawing = new Drawing(this);
	Movement movement = new Movement(this);
	
	public static int frogX, frogY;
	public static int points;

	public static boolean isAPressed = false;
	public static boolean isDPressed = false;
	public static boolean isWPressed = false;
	public static boolean isSPressed = false;


	public static float widthMultiplier;
	
	public static int[] length = new int[8], spacing = new int[8], velocity = new int[8];

	public static void main(String[] args) {

		PApplet.main("main.Main");

	}

	public void settings() {

		fullScreen();
		//size(400, 300);

	}

	public void setup() {
		
		widthMultiplier = (float) ((float) pixelWidth / (float) pixelHeight == 4.0 / 3.0 ? 3.0 / 4.0 : 9.0 / 16.0);
		reset();
		points = 0;
	}

	public void draw() {

		background(200);
		drawing.frog(frogX, frogY);
		movement.frogMovement();
		

		for(int i = 0; i < length.length; i++) {

			drawing.vehicleDraw(velocity[i], i + 1, length[i], spacing[i], i);
		}
		
		if (frogY <= pixelWidth * 1 / 40) reset();
		
	}

	
	
	public void keyPressed() {

		if (keyCode == 'A' || keyCode == LEFT) isAPressed = true;
		if (keyCode == 'D' || keyCode == RIGHT) isDPressed = true;
		if (keyCode == 'W' || keyCode == UP) isWPressed = true;
		if (keyCode == 'S' || keyCode == DOWN) isSPressed = true;

	}

	public void keyReleased() {

		if (keyCode == 'A' || keyCode == LEFT) isAPressed = false;
		if (keyCode == 'D' || keyCode == RIGHT) isDPressed = false;
		if (keyCode == 'W' || keyCode == UP) isWPressed = false;
		if (keyCode == 'S' || keyCode == DOWN) isSPressed = false;

	}

}
