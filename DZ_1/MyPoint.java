import java.lang.Math;
public class MyPoint {
    private int x =0;
    private int y =0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXY(){
        int[] arr = new int[2];
        arr[0]= this.x;
        arr[1] = this.y;
        return arr;
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x, 2)+ Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint another){
        return distance(another.getX(), another.getY());
    }

    public double distance(){
        return distance(0,0);
    }
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    public boolean equals(MyPoint pt){
        if(pt.hashCode() == this.hashCode())
        {return true;}
        else{
            return false;
        }
    }
}
