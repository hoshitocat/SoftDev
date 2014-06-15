package imomushi;

public abstract class MoveShape extends Shape implements Movable {
    private int direction;
    private int speed;
    
    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    public int getDirection() {
        return direction;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return this.speed;
    }
}
