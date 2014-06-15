package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends MoveShape {
    
    public Circle(double x, double y, double radius) {
        // TODO 自動生成されたコンストラクター・スタブ
        setShapeX(x);
        setShapeY(y);
        setShapeWidth(radius);
        setShapeHeight(radius);
    }
    
    @Override
    public void paint(Graphics g) {
        // TODO 自動生成されたメソッド・スタブ
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double rec = new Ellipse2D.Double(getShapeX(), getShapeY(), getShapeWidth(), getShapeHeight());
        g2.setColor(Color.BLACK);
        g2.fill(rec);
        g2.draw(rec);
    }
    
    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean collision_detection(Shape collisionShape) {
        // TODO Auto-generated method stub
        return false;
    }
}
