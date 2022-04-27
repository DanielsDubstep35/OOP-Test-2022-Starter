package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes;

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

			Nematode nematode = new Nematode(row);
			nematodes.add(nematode);
		}

	}


	public void draw()
	{	
		background(255);

		loadNematodes();

		// Assigning the Nematodes a name and drawing it to the screen
		for (Nematode nematode : nematodes)
		{
			nematode.setName(table.rows());

			fill(0, 408, 612);
			text(nematode.getName(), width / 2, height / 4);
		}

		// Assigning the Nematodes a length
		for (Nematode nematode : nematodes)
		{
			nematode.setLength(nematode.getLength());

			for (int i = 0; i < nematode.getLength(); i++) {
				ellipse(width / 2, i * (10), 10, 10);
			}
		}

		// Assigning the Nematodes a number of limbs
		for (Nematode nematode : nematodes)
		{
			nematode.setLimbs(nematode.getLength());

			for (int i = 0; i < nematode.getLength(); i++) {
				line( (width / 2) - 5, i * (10), 5, 5);
			}
		}

		// Assigning the Nematodes a gender
		for (Nematode nematode : nematodes)
		{
			text(nematode.getGender(), 10, 10);

			nematode.setLimbs(nematode.getGender());
		}

		// Assigning the Nematodes an eye or not
		for (Nematode nematode : nematodes)
		{
			text(nematode.getEyes(), 10, 10);

			nematode.setLimbs(nematode.getEyes());
		}

		// Choose your Nematode
		for (TableRow row : table.rows())
		{
			Nematode nematode = new Nematode(row);
			nematodes.add(nematode);
		}

	}
}
