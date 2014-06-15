package main;

import imomushi.Block;
import imomushi.Enemy;
import imomushi.MoveShape;
import imomushi.Shape;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.JFrame;


public class ImomushiMain extends JFrame implements ActionListener {
    
    public static final int FWIDTH = 800;
    public static final int FHEIGHT = 600;
    private int block_num = 3;
    
    public static Timer time;
    
    ArrayList<Shape> mapBlock;
    MoveShape enemy;
    MoveShape enemy_2;
    
    Random rand;
    
    int speed = 800;
    int time_add = 0;
    int time_up = 5000;

    public static void main(String[] args) {
        new ImomushiMain();
    }
    
    public ImomushiMain() {
        rand = new Random();
        mapBlock = new ArrayList<Shape>();
        
        this.setSize(FWIDTH, FHEIGHT);
        this.setVisible(true);

        for (int x = 0, y = 0, w = 20, h = 20; y < getHeight(); y += h) {
            Shape leftBlock = new Block(x, y, w, h);
            this.add(leftBlock, BorderLayout.CENTER);
            this.setVisible(true);
        }
        
        for (int x = getWidth() - 20, y = 0, w = 20, h = 20; y < getHeight(); y += h) {
            Shape rightBlock = new Block(x, y, w, h);
            this.add(rightBlock, BorderLayout.CENTER);
            this.setVisible(true);
        }

        for (int x = 20, y = 0, w = 20, h = 20; x < getWidth() - 20; x += w) {
            Shape rightBlock = new Block(x, y, w, h);
            this.add(rightBlock, BorderLayout.CENTER);
            this.setVisible(true);
        }

        for (int x = 20, y = getHeight() - 40, w = 20, h = 20; x < getWidth() - 20; x += w) {
            Shape rightBlock = new Block(x, y, w, h);
            this.add(rightBlock, BorderLayout.CENTER);
            this.setVisible(true);
        }
        
        for (int i = 0; i < block_num; i++) {
            mapBlock.add(new Block(rand.nextInt(getWidth() - 40) + 20, rand.nextInt(getHeight() - 40) + 20, 20, 20));
            this.add(mapBlock.get(i), BorderLayout.CENTER);
            this.setVisible(true);
        }
        
        enemy = new Enemy(rand.nextInt(getWidth()), rand.nextInt(getHeight()), 20);
        this.add(enemy, BorderLayout.CENTER);
        this.setVisible(true);
        
        enemy_2 = new Enemy(rand.nextInt(getWidth()), rand.nextInt(getHeight()), 20);
        this.add(enemy_2, BorderLayout.CENTER);
        this.setVisible(true);
        
        time = new Timer(speed, this);
        time.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        enemy.move();
        for (int i = 0; i < block_num; i++) {
            while(enemy.collision_detection(mapBlock.get(i))) {
                enemy.move();
            }
        }
        enemy_2.move();
        for (int i = 0; i < block_num; i++) {
            while(enemy_2.collision_detection(mapBlock.get(i))) {
                enemy_2.move();
            }
        }

        time_add += speed;
//        if (time_add == time_up) {
//            time.stop();
//        }
        repaint();
    }
}
