package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JOptionPane;

import main.ImomushiMain;

public class Caterpillar extends Circle implements KeyListener {
    
    static double moveX;
    static double moveY;
    double radius;
    
    static double caterpillar_move_x = 2.0;
    static double caterpillar_move_y;
    
    public Caterpillar(double x, double y, double radius) {
        super(x, y, radius);
    }
    
    public void move() {
        //double moveX;
        //double moveY;
        Random rand = new Random();
        
        moveX = getShapeX() + caterpillar_move_x; // nextDouble()は0 <= n < 1の値を返す
        moveY = getShapeY() + caterpillar_move_y;
        
        while (moveX > getWidth() - 40 || moveX < 20) {
            moveX = getShapeX() + rand.nextDouble() * 100 - 50;
        }
        while (moveY > getHeight() - 40 || moveY < 20) {
            moveY = getShapeY() + rand.nextDouble() * 100 - 50;
        }
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
        if (e.getKeyCode() == 37) {
            caterpillar_move_x = -2;
            caterpillar_move_y = 0;
        }
        else if (e.getKeyCode() == 38) {
            caterpillar_move_x = 0;
        }
        else if (e.getKeyCode() == 39) {
            caterpillar_move_x = 2;
            caterpillar_move_y = 0;
        }
        else if (e.getKeyCode() == 40) {
            caterpillar_move_x = 0;
            caterpillar_move_y = 2;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO 自動生成されたメソッド・スタブ
        
    }
    
    public static void increase_section() {
        //		ImomushiMain.section.add(new Section(moveX + 20.0, moveY, 20.0));
        System.out.println("節増えた.");
    }
    
    public static void dying() {
        // TODO 自動生成されたメソッド・スタブ
        JOptionPane.showMessageDialog(null, "m9(^Д^)ﾌﾟｷﾞｬｰ");
        System.exit(0);
    }
    
}
