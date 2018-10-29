public class DZ_2 {
    public static void main(String[] args) {
        MyComplex a = new MyComplex(1.0, 20.0);
        MyComplex b = a.conjugate();
        System.out.println(b.toString());

        MyPolynomial p1 = new MyPolynomial(7,4,3);
        MyPolynomial p2 = new MyPolynomial(0,3,7,2);
        MyPolynomial p3 = p1.multiply(p2);
        System.out.println(p3.toString());

        Ball ball = new Ball(5.0f,5.0f, 3, 6, 30);
        System.out.println(ball.toString());
        ball.move();
        System.out.println(ball.toString());

        Container cont = new Container(-30,-20,60,40);
        System.out.println(cont.toString());
        System.out.println(cont.collides(ball));
    }
}
