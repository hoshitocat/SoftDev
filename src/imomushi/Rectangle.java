package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Rectangle extends Shape {
    
    private double width;
    private double height;
    
    public Rectangle (double x, double y, double width, double height) {
        setCenter_x(x);
        setCenter_y(y);
        this.width = width;
        this.height = height;
    }
    public boolean collision_detection() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public void setRectWidth(double width) {
        this.width = width;
    }
    public void setRectHeight(double height) {
        this.height = height;
    }
    
    public double getRectWidth() {
        return this.width;
    }
    public double getRectHeight() {
        return this.height;
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D)g;
        
        Rectangle2D.Double rect = new Rectangle2D.Double(getCenter_x(), getCenter_y(), width, height);
        g2.setColor(Color.GRAY);
        g2.fill(rect);
        g2.setColor(Color.BLACK);
        g2.draw(rect);
    }
}
