package imomushi;

import javax.swing.JPanel;

public abstract class Shape extends JPanel implements Collitionable, Paintable {
    private  double x;
    private double y;
    private double shape_width;
    private double shape_height;
    
    public void setShapeX(double _x) {
        this.x = _x;
    }

    public void setShapeY(double _y) {
        this.y = _y;
    }

    public void setShapeWidth(double shape_width) {
        this.shape_width = shape_width;
    }
    
    public void setShapeHeight(double shape_height) {
        this.shape_height = shape_height;
    }

    public double getShapeX() {
        return x;
    }

    public double getShapeY() {
        return y;
    }

    public double getShapeWidth() {
        return this.shape_width;
    }
    
    public double getShapeHeight() {
        return this.shape_height;
    }
}

