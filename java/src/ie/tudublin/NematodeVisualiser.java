package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes;

	Nematode nematode;

	Table table;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	

	}
	

	public void loadNematodes()
	{
		
		Table table = loadTable("nematodes.csv", "header");

		nematodes = new ArrayList<Nematode>(15);

		for (TableRow row : table.rows())
		{

			nematode = new Nematode(row);
			nematodes.add(nematode);
		}

	}


	public void draw()
	{	
		background(255);

		loadNematodes();

		drawNematode();

		for (TableRow row : table.rows()) {

			drawNematode();
		}

	}

	private void nematode(int i) {
	}


	public void drawNematode() 
	{

		// drawing the name
		for (int i = 0; i < 13; i++) {
			String Name = nematode.getName();
			fill(200, 200, 200);
			textSize(50);
			text(Name, (i * 20), height / 2);
		}

		// drawing the body
		for (int i = 0; i < 13; i++) {
			ellipse((i * 20), height / 2, 10, 10);
		}

	}
}
