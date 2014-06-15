package imomushi;

import java.util.Random;

import main.ImomushiMain;

public class Section extends Caterpillar{
	
	static double moveX;
	static double moveY;
	
	public Section(double x, double y, double radius) {
		super(x, y, radius);
	}
	
	public void move() {
		Random rand = new Random();
        
        //moveX = ; // nextDouble()は0 <= n < 1の値を返す
        //moveY = ;
        
        while (moveX > getWidth() - 40 || moveX < 20) {
            moveX = getShapeX() + rand.nextDouble() * 100 - 50;
        }
        while (moveY > getHeight() - 40 || moveY < 20) {
            moveY = getShapeY() + rand.nextDouble() * 100 - 50;
        }
        setShapeX(moveX);
        setShapeY(moveY);
	}
}
