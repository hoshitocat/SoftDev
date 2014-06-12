package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Rectangle extends Shape {
    
    private double width;
    private double height;
    private Rectangle2D rect;
    
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

    @Override
    public void paint(Graphics g) {
        System.out.println(getCenter_x());
        System.out.println(getCenter_y());
        System.out.println(width);
        System.out.println(height);
        // TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D)g;
        
        this.rect = new Rectangle2D.Double(getCenter_x(), getCenter_y(), width, height);
        g2.fill(rect);
        g2.draw(rect);
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getRectWidth() {
        return this.width;
    }
    public double getRectHeight() {
        return this.height;
    }
}
