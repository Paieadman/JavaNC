public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = width + this.x1;
        this.y2 = height + this.y1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getHeight(){
        return (this.y2- this.y1);
    }

    public int getWidth(){
        return (this.x2- this.x1);
    }

    public boolean collides (Ball ball){
        return ((this.x2>ball.getX()+ ball.getRadius())&&(this.y2>ball.getY()+ ball.getRadius())
        && (this.x1<ball.getX()- ball.getRadius())&& (this.y1<ball.getY()- ball.getRadius()));
    }
    @Override
    public String toString(){
        String str ="Container[";
        str+= "("+this.x1+","+this.y1+")";
        str+= ",";
        str+= "("+this.x2+","+this.y2+")";
        str+= "]";
        return str;
    }
}
