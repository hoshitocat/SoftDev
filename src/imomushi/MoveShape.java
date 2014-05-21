package imomushi;

public abstract class MoveShape extends Shape implements Movable {
    private int direction;
    
    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    public int getDirection() {
        return direction;
    }
}
