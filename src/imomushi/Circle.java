package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends MoveShape {
    private double radius;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void move() {
        
    }
    
    public boolean collision_detection() {
        return true;
        
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double rec = new Ellipse2D.Double(getCenter_x() - radius, getCenter_y() - radius, radius * 2, radius * 2);
        g2.setColor(Color.BLACK);
        g2.fill(rec);
        g2.draw(rec);
    }
}
