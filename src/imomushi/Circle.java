package imomushi;

import java.awt.Graphics;
import java.awt.Graphics2D;

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
        
    }
}
