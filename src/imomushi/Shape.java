package imomushi;

import javax.swing.JApplet;

public abstract class Shape extends JApplet implements Collitionable, Paintable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private  double center_x;
    private double center_y;
    
    public void setCenter_x(double center_x) {
        this.center_x = center_x;
    }

    public void setCenter_y(double center_y) {
        this.center_y = center_y;
    }
    
    public double getCenter_x() {
        return center_x;
    }

    public double getCenter_y() {
        return center_y;
    }
}

