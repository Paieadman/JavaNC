public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public  Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        this(1.0f,1.0f);
    }

    public float getArea(){
        return this.length*this.width;
    }

    public float getPerimetr(){
        return ((this.length+this.width)*2);
    }

    @Override
    public String toString(){
        return "Rectangle[ length = "+ this.length+ ", width = "+ this.width+"]";
    }
}
