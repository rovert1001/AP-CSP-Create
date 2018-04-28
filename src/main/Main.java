package main;

import processing.core.PApplet;
import shapes.Frog;
import input.Hopping;
import shapes.Vehicles;
import java.util.concurrent.ThreadLocalRandom;


public class Main extends PApplet{

	Frog frogOne = new Frog(this);
	Vehicles cars = new Vehicles(this);
	Hopping frogMovement = new Hopping(this);
	public static int frogX, frogY;

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


	public static float widthMultiplier;

	public static void main(String[] args) {

		PApplet.main("main.Main");

	}

	public void settings() {

		fullScreen();
		//size(400, 300);

	}

	public void setup() {

		frogX = pixelWidth / 2;
		frogY = pixelHeight * 17 / 20;

		widthMultiplier = (float) ((float) pixelWidth / (float) pixelHeight == 4.0 / 3.0 ? 3.0 / 4.0 : 9.0 / 16.0);

	}

	public void draw() {

		background(200);
		frogOne.frog(frogX, frogY);
		Hopping.frogMovement();


		for(float i = 1; i < 9; i++) {

			int spacing = ThreadLocalRandom.current().nextInt(125, 501);
			System.out.println(spacing);
			System.out.println(spacing);
			cars.vehicles(i, spacing, pixelWidth / 10);
		}




	}

	public void keyPressed() {

		if (keyCode == SHIFT) isShiftPressed = true;
		if (keyCode == 'A' || keyCode == LEFT) isAPressed = true;
		if (keyCode == 'D' || keyCode == RIGHT) isDPressed = true;
		if (keyCode == 'W' || keyCode == UP) isWPressed = true;
		if (keyCode == 'S' || keyCode == DOWN) isSPressed = true;
		if (keyCode == 'I') isIPressed = true;
		if (keyCode == 'K') isKPressed = true;
		if (keyCode == 'J') isJPressed = true;
		if (keyCode == 'L') isLPressed = true;

	}

	public void keyReleased() {

		if (keyCode == SHIFT) isShiftPressed = false;
		if (keyCode == 'A' || keyCode == LEFT) isAPressed = false;
		if (keyCode == 'D' || keyCode == RIGHT) isDPressed = false;
		if (keyCode == 'W' || keyCode == UP) isWPressed = false;
		if (keyCode == 'S' || keyCode == DOWN) isSPressed = false;
		if (keyCode == 'I') isIPressed = false;
		if (keyCode == 'K') isKPressed = false;
		if (keyCode == 'J') isJPressed = false;
		if (keyCode == 'L') isLPressed = false;


	}

}
