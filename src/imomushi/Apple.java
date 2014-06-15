package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Apple extends Circle {
    
    private Color color;
    
    public Apple(double x, double y, double radius, Color color) {
        super(x, y, radius);
        // TODO 自動生成されたコンストラクター・スタブ
        this.color = color;
    }
    public void move() {
        Random rand = new Random();
        
        setShapeX(rand.nextInt(getWidth() - 40) + 20);
        setShapeY(rand.nextInt(getHeight() - 40) + 20);
    }
    
    public boolean collision_detection(Shape collisionShape) {
        
        if (Math.abs(collisionShape.getShapeX() - this.getShapeX()) < this.getShapeWidth() - 5.0) {
            if (Math.abs(collisionShape.getShapeY() - this.getShapeY()) < this.getShapeHeight() - 5.0) {
                this.move();
                return true; 
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public void paint(Graphics g) {
        // TODO 自動生成されたメソッド・スタブ
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double rec = new Ellipse2D.Double(getShapeX(), getShapeY(), getShapeWidth(), getShapeHeight());
        g2.setColor(color);
        g2.fill(rec);
        g2.draw(rec);
    }
    
}
