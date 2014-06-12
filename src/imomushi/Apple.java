/**
 * 
 */
/**
 * @author takuya YAGINUMA
 *
 */
package imomushi;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Point;

import javax.swing.*;
import javax.swing.Timer;

import java.util.Random;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Dimension;


public class Apple extends Circle {
	private double radius;

	private  double center_x = 10 ;
	private double center_y = 10;

	private Random rand;
	private int direction;
	ArrayList<Point> listBody;


	Circle apple = new Circle();


	public Apple(double radius, double center_x, double center_y, Random rand,
			int direction, ArrayList<Point> listBody, Circle apple) {
		super();
		this.radius = radius;
		this.center_x = center_x;
		this.center_y = center_y;
		this.rand = rand;
		this.direction = direction;
		this.listBody = listBody;
		this.apple = apple;
	}

	public void paint(Graphics g) {


		g.setColor(Color.white);
		Dimension size = getSize();
		g.fillRect(0, 0, size.width - 1, size.height - 1);

		g.setColor(Color.red);
		g.fillOval((int)center_x, (int)center_y, 10, 10);

	}

	//public void setDirection(int direction) {
	//	this.direction = direction;
	//}
	//	public int getDirection() {
	//	return direction;
	//}
	//public void setCenter_x(double center_x) {
	//	this.center_x = center_x;
	//}
	//	public void setCenter_y(double center_y) {
	//	this.center_y = center_y;
	//}
	//	public double getCenter_x() {
	//	return center_x;
	//}
	//	public double getCenter_y() {
	//	return center_y;
	//}
	//	public void setRadius(double radius) {
	//	this.radius = radius;
	//}
	//	public double getRadius() {
	//	return radius;
	//}
	//	public void move() {
	//	}
	public boolean collision_detection() {
		ArrayList<Point> listBody;
		return true;
	}



}