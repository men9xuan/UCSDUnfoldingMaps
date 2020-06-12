package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PConstants;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;

	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());

	}

	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.pushStyle();
		pg.stroke(0,220,150,120);
		pg.fill(0,0,0,50);
		//pg.fillColor(255);
		pg.ellipse(x, y, 6, 6);

		//pg.strokeWeight(1);
		int buffer = 2;
		pg.line(x-(+buffer), 
				y-(+buffer), 
				x+buffer, 
				y+buffer);
		pg.line(x-(+buffer), 
				y+(+buffer), 
				x+buffer, 
				y-(+buffer));
		pg.popStyle();

	}


	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		// show rectangle with title

		String code = (String)getCode()+" "+(String)getName();
		
		pg.pushStyle();

		pg.rectMode(PConstants.CORNER);

		pg.stroke(110);
		pg.fill(255,255,255);
		pg.rect(x, y + 15, pg.textWidth(code) +6, 18, 5);

		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.fill(0);
		pg.text(code, x + 3 , y +18);


		pg.popStyle();
		//System.out.println(code);

	}


	// show routes

	public String getCode()
	{
		return getStringProperty("code");
	}
	
	private String getName()
	{
		return getStringProperty("name");
	}
}
