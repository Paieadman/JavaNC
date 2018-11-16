import java.util.ArrayList;

public class MainClass {
    public static <MyPolynomial> void main(String[] args) {

        MyLinkedList<Node> mc = new MyLinkedList<Node>(new Node());
        mc.add(new Node());
        mc.add(new Node());
        mc.add(new Node());
        mc.add(0, new Node());//insert index =0 doesn't work
        System.out.println(mc.toString());
        System.out.println(mc.size());
        System.out.println(mc.get(0));
        //System.out.println(mc.indexOf());
        //mc.set(0, 8);
        System.out.println(mc.toString());
        System.out.println(TimeTest.job());
    }
}
