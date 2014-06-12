package imomushi;

import javax.swing.JPanel;

public abstract class Shape extends JPanel implements Collitionable, Paintable {
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

