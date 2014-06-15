package imomushi;

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
        
        moveX = getShapeX() + rand.nextDouble() * 500 - 250; // nextDouble()は0 <= n < 1の値を返す
        moveY = getShapeY() + rand.nextDouble() * 500 - 250;
        
        while (moveX > getWidth() - 40 || moveX < 20) {
            moveX = getShapeX() + rand.nextDouble() * 100 - 50;
        }
        while (moveY > getHeight() - 40 || moveY < 20) {
            moveY = getShapeY() + rand.nextDouble() * 100 - 50;
        }
        setShapeX(moveX);
        setShapeY(moveY);
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
    
}
