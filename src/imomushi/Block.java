package imomushi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Block extends Rectangle {

    public Block(double x, double y, double width, double height) {
        super(x, y, width, height);
    }
    @Override
    public boolean collision_detection(Shape collisionShape) {
        System.out.println(Math.abs(collisionShape.getShapeX() - this.getShapeX()));
        if (Math.abs(collisionShape.getShapeX() - this.getShapeX()) <= this.getShapeWidth()) {
            if (Math.abs(collisionShape.getShapeY() - this.getShapeX()) <= this.getShapeHeight()) {
               System.out.println("ブロックと衝突しました");
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
