package com.dp.FlyweightPattern;
import java.awt.*;
public class MyRect {

	private Color color;
	private int x, y, x2, y2;
	
	/*public MyRect(Color color, int upX, int upY, int lowX, int lowY){
		this.color = color;
		x = upX;
		y = upY;
		x2 = lowX;
		y2 = lowY;
	}
	
	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, x2, y2);
	}*/
	
	public MyRect(Color color){
		this.color = color;
	}
	
	public void draw(Graphics g, int upX, int upY, int lowX, int lowY){
		g.setColor(color);
		g.fillRect(upX, upY, lowX, lowY);
	}
}
