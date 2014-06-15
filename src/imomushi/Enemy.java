package imomushi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Enemy extends Circle{
    
    public double radius;
    
    public Enemy(double x, double y, double radius, int speed) {
        super(x, y, radius);
        setSpeed(speed);
    }
    
    public void move() {
        double moveX;
        double moveY;
        ArrayList<Double> direction_num = new ArrayList<Double>();
        direction_num.add(0.0);
        direction_num.add(90.0);
        direction_num.add(180.0);
        direction_num.add(270.0);
        Collections.shuffle(direction_num);
        
        moveX = this.getShapeX() + (Math.cos(Math.toRadians(direction_num.get(0))) * (getSpeed() + 1));
        moveY = this.getShapeY() + (Math.sin(Math.toRadians(direction_num.get(0))) * (getSpeed() + 1));
        
        if (moveX > getWidth() - 40) {
            moveX = getWidth() - 50;
        }
        else if (moveX < 20) {
            moveX = 30;
        }
        
        if (moveY > getHeight() - 40) {
            moveY = getHeight() - 50;
        }
        else if (moveY < 20) {
            moveY = 30;
        }
        
        setShapeX(moveX);
        setShapeY(moveY);
    }
    
    @Override
    public boolean collision_detection(Shape collisionShape) {
        
        if (Math.abs(collisionShape.getShapeX() - this.getShapeX()) < this.getShapeWidth() - 5.0) {
            if (Math.abs(collisionShape.getShapeY() - this.getShapeY()) < this.getShapeHeight() - 5.0) {
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
}
