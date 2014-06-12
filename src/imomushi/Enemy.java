package Imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import main.ImomushiMain;

public class Enemy extends Circle{
	
	//public double x;
	//public double y;
	public double radius;
	private double point_distance;
	private double radius_distance;
	
	public Enemy(double x, double y, double radius) {
		super(x, y, radius);
		//this.x = x;
		//this.y = y;
		//this.radius = radius;
		setX(x);
		setY(y);
		setRadius(radius);
		System.out.println("enemy x = " + getx() + ", enemy y = " + gety());
	}
	
	public void move(double moveX, double moveY) {
		setX(getx() + moveX);
		setY(gety() + moveY);
		
		//System.out.println("x = " + x + ", y = " + y);
	}
	
	/*
	public double getx() {
		// TODO 自動生成されたメソッド・スタブ
		return this.x;
	}
	
	public double gety() {
		// TODO 自動生成されたメソッド・スタブ
		return this.y;
	}
	
	public double getRadius() {
		return this.radius;
	}
	*/
	
	public void collision_detection(double cx, double cy, double cradius) {
		
		point_distance = Math.sqrt(Math.pow((getx() - cx), 2) + Math.pow((gety() - cy), 2));
		radius = getRadius();
		
		radius_distance = radius + cradius;
		
		//System.out.println("enemy x = " + getx());
		//System.out.println("enemy y = " + gety());
		System.out.println("enemy enemy_radius = " + getRadius());
		
		//System.out.println("caterpillar x = " + cx);
		//System.out.println("caterpillar y = " + cy);
		//System.out.println("caterpillar_radius = " + cradius);
		
		System.out.println("point_distance = " + point_distance);
		
		if(point_distance + 5.0 < radius_distance) {
			JOptionPane.showMessageDialog(null, "m9(^Д^)ﾌﾟｷﾞｬｰ");
			ImomushiMain.time.stop();
			new ImomushiMain();
			
			return;
		}
		System.out.println("まだ死んでない."); 
		return;
	}
	
	public void paint(Graphics g) {
		paint(g);
//		Graphics2D g2 = (Graphics2D) g;
//		
//		Ellipse2D.Double rec = new Ellipse2D.Double(getx() - radius, gety() - radius, radius * 2, radius * 2);
//		System.out.println("enemy x = " + getx());
//		System.out.println("enemy y = " + gety());
//		g2.setColor(Color.BLACK);
//		g2.fill(rec);
//		g2.draw(rec);
	}
	
}
