package main;

import imomushi.Block;
import imomushi.Shape;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.JFrame;


public class ImomushiMain extends JFrame implements ActionListener {
    
    public static final int FWIDTH = 800;
    public static final int FHEIGHT = 600;
    
    public static Timer time;
    
    Random rand;
    
    int speed = 200;
    int time_add = 0;
    int time_up = 5000;

    public static void main(String[] args) {
        new ImomushiMain();
    }
    
    public ImomushiMain() {
        int block_num = 3;
        rand = new Random();
        
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
            Shape mapBlock = new Block(rand.nextInt(getWidth() - 80) + 40, rand.nextInt(getHeight() - 80) + 40, 20, 20);
            this.add(mapBlock, BorderLayout.CENTER);
            this.setVisible(true);
        }
        
        time = new Timer(speed, this);
        time.start();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        time_add += speed;
        if (time_add == time_up) {
            time.stop();
        }
        repaint();
    }
}
