package imomushi;

public class Rectangle extends Shape {
    
    private double height;
    private double width;
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    public boolean collision_detection() {
        // TODO Auto-generated method stub
        return false;
    }

    public void draw() {
        // TODO Auto-generated method stub
        
    }
    
}
