import java.lang.Math;
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length-1;
    }
    public double getIValue(int i){
        return coeffs[i];
    }
    public String toString(){
        String str = "";
        for (int i = coeffs.length-1; i>-1; i--){
            str += coeffs[i] + " x^"+i+" ";
        }
        return str;
    }

    public double evaluate(double x){
        double result = 0;
        for (int i = coeffs.length-1; i>-1; i--){
            result+=coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        MyPolynomial larger;
        MyPolynomial smaller;
        if(this.getDegree()> right.getDegree()){
            larger = this;
            smaller = right;
        }
        else{
            larger = right;
            smaller = this;
        }

        double[] poly = new double[larger.getDegree()+1];

        for(int i = 0; i<= smaller.getDegree()+1;i++)
        {
            poly[i] = smaller.getIValue(i) + larger.getIValue(i);
        }
        if(smaller.getDegree()!= larger.getDegree()) {
            for (int i = smaller.getDegree() + 2; i <= larger.getDegree() + 1; i++) {
                poly[i] = larger.getIValue(i);
            }
        }

        return new MyPolynomial(poly);
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] poly = new double[this.getDegree()+right.getDegree()+1];
        for(int i = 0; i< this.getDegree()+1;i++){
            for (int j = 0; j< right.getDegree()+1; j++){

                poly[i+j] += this.getIValue(i)* right.getIValue(j);

            }
        }
        return new MyPolynomial(poly);
    }

    private  int doubleHash(double value){
        int result = 17;
        result = 31* result + (int)(Double.doubleToLongBits(value)^(Double.doubleToLongBits(value)>>> 32));
        return  result;
    }

    public int hashCode(){
        int result = 17;
        for (double i : coeffs){
            result += doubleHash(i);
        }
        return  result;
    }

    public boolean equals(MyPolynomial poly){
        if(poly.hashCode() == this.hashCode()){
            return true;
        } else{
            return  false;
        }
    }
}
