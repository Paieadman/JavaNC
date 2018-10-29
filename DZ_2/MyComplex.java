import java.lang.Math;
public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){
        this.real = 0.0d;
        this.imag = 0.0d;
    }

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return this.real;
    }

    public void setReal(double real){
        this.real = real;
    }

    public double getImag(){
        return this.imag;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString(){
        return (this.real+ "+" + this.imag + "i");
    }

    public boolean isReal(){
        if(this.real == 0.0d){
            return false;
        } else{
            return true;
        }
    }

    public boolean isImaginary(){
        if(this.imag == 0.0d){
            return false;
        } else{
            return true;
        }
    }

    public boolean equals(double real, double imag){
        return ((this.real == real)&&(this.imag == imag));
    }

    public boolean equals(MyComplex another){
        return equals(another.getReal(), another.getImag());
    }

    public double magnitude(){
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }

    public MyComplex add(MyComplex right){
        this.real = this.real + right.getReal();
        this.imag = this.imag + right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right){
        this.real = this.real - right.getReal();
        this.imag = this.imag - right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right){
        this.real = (this.real * right.getReal()) - (this.imag * right.getImag());
        this.imag = (this.real * right.getImag())+ (this.imag * this.getReal());
        return this;
    }

    public MyComplex divide(MyComplex right){
        double zn = right.getReal()*right.getReal() + right.getImag()*right.getImag();
        this.real = (this.real * right.getReal()) + (this.imag * right.getImag())/(zn);
        this.imag = (this.real * right.getImag())- (this.imag * this.getReal())/(zn);
        return this;
    }

    public MyComplex conjugate(){
        return (new MyComplex(this.real, (-1)*this.imag));
    }

}
