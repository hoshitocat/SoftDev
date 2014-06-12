package main;

import imomushi.Block;
import imomushi.Rectangle;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JFrame;

public class ImomushiMain extends JFrame implements ActionListener {
    
    public static final int FWIDTH = 800;
    public static final int FHEIGHT = 500;
    
    Timer time;
    
    int speed = 500;
    int time_add = 0;
    int time_up = 5000;

    public static void main(String[] args) {
        ImomushiMain imomushi = new ImomushiMain();
    }
    
    public ImomushiMain() {
        this.setSize(FWIDTH, FHEIGHT);
        this.setVisible(true);

        Rectangle rightBlock = new Rectangle(10, 10, 100, 100);
        this.add(rightBlock, BorderLayout.CENTER);
        this.setVisible(true);

        Rectangle leftBlock = new Rectangle(100, 100, 100, 100);
        this.add(leftBlock, BorderLayout.CENTER);
        this.setVisible(true);
//
//        Block topBlock = new Block(10, 0, getWidth(), 10);
//        this.add(topBlock, BorderLayout.CENTER);
//        this.setVisible(true);
//
//        Block buttomBlock = new Block(10, getHeight() - 10, getWidth(), 10);
//        this.add(buttomBlock, BorderLayout.CENTER);
//        this.setVisible(true);
        
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
