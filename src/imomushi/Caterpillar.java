package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.ImomushiMain;

public class Caterpillar extends Circle implements KeyListener {
    
    public Caterpillar(double x, double y, double radius, int direction) {
        super(x, y, radius);
        this.setDirection(direction);
        setSpeed(20);
    }
    
    public void move() {
        double moveX;
        double moveY;
        
        moveX = this.getShapeX() + (Math.cos(Math.toRadians(this.getDirection())) * getSpeed());
        moveY = this.getShapeY() + (Math.sin(Math.toRadians(this.getDirection())) * getSpeed());
        
        setShapeX(moveX);
        setShapeY(moveY);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO 自動生成されたメソッド・スタブ
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO 自動生成されたメソッド・スタブ
        if (e.getKeyCode() == 37) { // 左
            this.setDirection(180);
        }
        else if (e.getKeyCode() == 38) { // 下
            this.setDirection(270);
        }
        else if (e.getKeyCode() == 39) { // 右
            this.setDirection(0);
        }
        else if (e.getKeyCode() == 40) { // 上
            this.setDirection(90);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO 自動生成されたメソッド・スタブ
        
    }
    
    public static void dying() {
        // TODO 自動生成されたメソッド・スタブ
        JOptionPane.showMessageDialog(null, "m9(^Д^)ﾌﾟｷﾞｬｰ");
        System.exit(0);
    }
    
    @Override
    public void paint(Graphics g) {
        // TODO 自動生成されたメソッド・スタブ
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double rec = new Ellipse2D.Double(getShapeX(), getShapeY(), getShapeWidth(), getShapeHeight());
        g2.setColor(Color.GREEN);
        g2.fill(rec);
        g2.draw(rec);
    }

	public void decrease_section(ArrayList<Section> section) {
		// TODO 自動生成されたメソッド・スタブ
		if(section.size() == 0) {
			Caterpillar.dying();
			return;
		}
		section.get(section.size() - 1).setShapeX(1500.0);
		section.get(section.size() - 1).setShapeY(1500.0);
		section.remove(section.get(section.size() - 1));
		System.out.println("10秒経過したので最後尾の節が消えました.");
		return;
	}
    
}
