package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Rectangle extends Shape {
    
    public Rectangle (double x, double y, double width, double height) {
        setShapeX(x);
        setShapeY(y);
        setShapeWidth(width);
        setShapeHeight(height);
    }
    public boolean collision_detection() {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D)g;
        
        Rectangle2D.Double rect = new Rectangle2D.Double(getShapeX(), getShapeY(), getShapeWidth(), getShapeHeight());
        g2.setColor(Color.GRAY);
        g2.fill(rect);
        g2.setColor(Color.BLACK);
        g2.draw(rect);
    }
    @Override
    public boolean collision_detection(Shape collisionShape) {
        // TODO Auto-generated method stub
        return false;
    }
    
    
}
