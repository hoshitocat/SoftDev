package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Section extends Caterpillar{
    
    private double followX;
    private double followY;
    
    public Section(double x, double y, double radius, int direction, double followX, double followY) {
        super(x, y, radius, direction);
        // TODO Auto-generated constructor stub
        this.followX = followX;
        this.followY = followY;
    }
    
    public void setFollowX(double x) {
        this.followX = x;
    }
    
    public void setFollowY(double y) {
        this.followY = y;
    }
    
    public double getFollowX() {
        return this.followX;
    }
    
    public double getFollowY() {
        return this.followY;
    }
    
    public void move() {
        setShapeX(followX);
        setShapeY(followY);
    }

    @Override
    public void paint(Graphics g) {
        // TODO 自動生成されたメソッド・スタブ
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double rec = new Ellipse2D.Double(getShapeX(), getShapeY(), getShapeWidth(), getShapeHeight());
        g2.setColor(Color.BLUE);
        g2.fill(rec);
        g2.draw(rec);
    }
}