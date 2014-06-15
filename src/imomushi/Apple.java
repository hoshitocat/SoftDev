package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import main.ImomushiMain;

public class Apple extends Circle {
    
    private double point_distance;
    private double radius;
    private double radius_distance;
    
    public Apple(double x, double y, double radius) {
        super(x, y, radius);
        // TODO 自動生成されたコンストラクター・スタブ
    }
    public void move() {
        double moveX;
        double moveY;
        Random rand = new Random();
        
        setShapeX(rand.nextInt(getWidth() - 40) + 20);
        setShapeY(rand.nextInt(getHeight() - 40) + 20);
    }
    
    public boolean collision_detection(Shape collisionShape) {
        
        if (Math.abs(collisionShape.getShapeX() - this.getShapeX()) < this.getShapeWidth() - 5.0) {
            if (Math.abs(collisionShape.getShapeY() - this.getShapeY()) < this.getShapeHeight() - 5.0) {
                Caterpillar.increase_section();
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
        g2.setColor(Color.RED);
        g2.fill(rec);
        g2.draw(rec);
    }
    
}
