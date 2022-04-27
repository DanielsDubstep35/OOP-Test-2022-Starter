package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

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
		
		for (TableRow row : table.rows())
		{

			ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

			Nematode nematode = new Nematode(row);
			nematodes.add(nematode);
		}

	}


	public void draw()
	{	
		background(0);
		
		ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

		loadNematodes();

		// Assigning the Nematodes a name
		for (Nematode nematode : nematodes)
		{
			text(nematode.getName(), 10, 10);

			nematode.setName(nematode.getName());
		}

		// Assigning the Nematodes a length
		for (Nematode nematode : nematodes.getLength())
		{
			text(nematode.getLength(), 10, 10);

			nematode.setLength(nematode.getLength());
		}

		// Assigning the Nematodes a number of limbs
		for (Nematode nematode : nematodes.getLimbs())
		{
			text(nematode.getLimbs(), 10, 10);

			nematode.setLimbs(nematode.getLimbs());
		}

		// Assigning the Nematodes a gender
		for (Nematode nematode : nematodes.getGender())
		{
			text(nematode.getLimbs(), 10, 10);

			nematode.setLimbs(nematode.getGender());
		}

		// Assigning the Nematodes an eye or not
		for (Nematode nematode : nematodes.getEyes())
		{
			text(nematode.getLimbs(), 10, 10);

			nematode.setLimbs(nematode.getEyes());
		}

	}
}
