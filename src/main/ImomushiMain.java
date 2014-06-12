package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import Imomushi.Caterpillar;
import Imomushi.Enemy;
import Imomushi.Shape;

public class ImomushiMain extends JFrame implements ActionListener{
    
	public static Shape enemy;
	public static Shape enemy2;
	public static Shape caterpillar;
	
	public static final int FWIDTH = 800;

	public static final int FHEIGHT = 800;
	
	public static Timer time;
	Random rand;
	
	double e_x, e_y;
	public int speed = 200;
	public static int time_add = 0;
	public int time_up = 600;
	
	public ImomushiMain() {
		this.setSize(FWIDTH, FHEIGHT);
	    this.setVisible(true);
	    
	    caterpillar = new Caterpillar(300.0, 300.0, 20.0);
	    this.add(caterpillar, BorderLayout.CENTER);
    	this.setVisible(true);
    	
	    enemy = new Enemy(200.0, 200.0, 20.0);
	    this.add(enemy, BorderLayout.CENTER);
    	this.setVisible(true);
    	
	    enemy2 = new Enemy(400.0, 400.0, 30.0);
	    this.add(enemy2, BorderLayout.CENTER);
    	this.setVisible(true);
    	
    	rand = new Random();
    	
    	time = new Timer(speed, this);
		time.start();
	}
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	ImomushiMain imomushi = new ImomushiMain();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		//e_x = rand.nextInt(50) - 15;
		//e_y = rand.nextInt(50) - 15;
		e_x = 5;
		e_y = 5;
    	enemy.move(e_x, e_y);
    	enemy2.move(e_x, e_y);
    	//this.add(enemy, BorderLayout.CENTER);
    	//this.remove(enemy);
    	//this.setVisible(true);
    	enemy.collision_detection(caterpillar.getx(), caterpillar.gety(), caterpillar.getRadius());
    	enemy2.collision_detection(caterpillar.getx(), caterpillar.gety(), caterpillar.getRadius());
    	time_add += speed;
    	if(time_add == time_up) {
    		time.stop();
    	}
    	repaint();
	}
	
    
}
