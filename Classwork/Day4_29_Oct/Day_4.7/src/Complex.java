

public class Complex{ // Packaged class 

    private int real;
    private int imag;
    public Complex( ){
        this.real = 10;
        this.imag = 20;
    }
    @Override
    public String toString() {
        return this.real+"  "+this.imag;
    }


}