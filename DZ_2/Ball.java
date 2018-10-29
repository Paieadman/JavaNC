import java.lang.Math;
public class Ball {
    private float x = 0.0f;
    private float y = 0.0f;
    private int radius = 0;
    private float xDelta = 0.0f;
    private float yDelta = 0.0f;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float)Math.cos(direction);
        this.yDelta = speed * (float)Math.sin(direction);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x = this.x + this.xDelta;
        this.y = this.y + this.yDelta;
    }

    public void reflectHorizontal(){
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical(){
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString(){
        String str = "Ball[";
        str+= "("+ this.x  + "," + this.y+")";
        str+= ","+"speed = "+" ("+ this.xDelta  + "," + this.yDelta+")";
        str+= "]";
        return str;
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }
}
