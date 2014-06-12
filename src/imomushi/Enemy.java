package imomushi;

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
		setCenter_x(x);
		setCenter_y(y);
		setRadius(radius);
	}
	
	public void move(double moveX, double moveY) {
		setCenter_x(getCenter_x() + moveX);
		setCenter_y(getCenter_y() + moveY);
		
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
		
		point_distance = Math.sqrt(Math.pow((getCenter_x() - cx), 2) + Math.pow((getCenter_y() - cy), 2));
		radius = getRadius();
		
		radius_distance = radius + cradius;
		
		System.out.println("enemy enemy_radius = " + getRadius());
		
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
	
	
}
