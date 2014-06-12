package Imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;

public class Circle extends MoveShape {
	private double radius;

	public Circle(double x, double y, double radius) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void paint(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double rec = new Ellipse2D.Double(getCenter_x() - radius, getCenter_y() - radius, radius * 2, radius * 2);
		g2.setColor(Color.BLACK);
		g2.fill(rec);
		g2.draw(rec);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		return;
	}

	@Override
	public boolean collision_detection(double x, double y, double radius) {
		return true;
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
