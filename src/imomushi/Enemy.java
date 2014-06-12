package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import main.ImomushiMain;

public class Enemy extends Circle{
    
    public double radius;
    private double point_distance;
    private double radius_distance;
    
    public Enemy(double x, double y, double radius) {
        super(x, y, radius);
    }
    
    public void move(double moveX, double moveY) {
        setCenter_x(getCenter_x() + moveX);
        setCenter_y(getCenter_y() + moveY);
    }
    
    public boolean collision_detection(double cx, double cy, double cradius) {
        
        point_distance = Math.sqrt(Math.pow((getCenter_x() - cx), 2) + Math.pow((getCenter_y() - cy), 2));
        radius = getRadius();
        
        radius_distance = radius + cradius;
        
        if(point_distance + 5.0 < radius_distance) {
            return false;
        }
        return true;
    }
}
