public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimetr(){
        return v1.distance(v2)+v2.distance(v3)+v1.distance(v3);
    }

    public String getType(){
        double o1 = v1.distance(v2);
        double o2 = v1.distance(v3);
        double o3 = v3.distance(v2);

        if(o1==o2 && o2 == o3 && o3 == o1){
            return "Equilaterial";
        }
        else {
            if(o1==o2 || o2 == o3 || o3 == o1){
                return "Isosceles";
            }
            else
            {
                return "Scalene";
            }
        }
    }
}
