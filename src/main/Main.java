package main;

import processing.core.PApplet;
import shapes.Frog;
import static control.KeyboardEvents.*; 

public class Main extends PApplet{

	Frog frogOne = new Frog(this);
	public static int frogX, frogY;



	public static float widthMultiplier;

	public static void main(String[] args) {

		PApplet.main("main.Main");

	}

	public void settings() {

		//fullScreen();
		size(400, 300);

	}

	public void setup() {



		widthMultiplier = (float) ( pixelWidth / pixelHeight == 4.0 / 3.0 ? 3.0 / 4.0 : 9.0 / 16.0);

	}

	public void draw() {
		
		background(200);
		frogOne.frog(frogX, frogY);


	}

	public void keyPressed() {
		
		keyPresses();

	}

	public void keyReleased() {

		keyReleases();

	}

}
