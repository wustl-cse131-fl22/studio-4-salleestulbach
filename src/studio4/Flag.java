package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		
		StdDraw.setPenColor(Color.lightGray);
		
		double [] x = {0, 0, 0.2, 0.35, 0.5, 0.7, 0.8, 0.9, 1, 1};
		double [] y = {0, 0.25, 0.7, 0.45, 0.55, 0.4, 0.85, 0.45, 0.6, 0};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenRadius(0.2);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.line(0, 0, 1, 0);
	}
}