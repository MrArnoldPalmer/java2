import java.lang.*;
import java.math.*;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int n, int d) {
        if(d > 0 && n >= 0) {
            this.numerator = n;
            this.denominator = d;
        }
        else
            System.out.println("The denominator must be above 0 and the denominator cannot be negative");
    }

    public Rational add(Rational r2) {
        Rational r = new Rational((this.numerator * r2.denominator) + (r2.numerator * this.denominator), (this.denominator * r2.denominator));    
        return r;
    }

    public Rational subtract(Rational r2) {
        Rational r = new Rational((this.numerator * r2.denominator) - (r2.numerator * this.denominator), (this.denominator * r2.denominator));

        return r;
    }

    public Rational multiply(Rational r2) {
        Rational r = new Rational(this.numerator * r2.numerator, this.denominator * r2.denominator);

        return r;
    }

    public Rational divide(Rational r2) {
        Rational r = new Rational(this.numerator * r2.denominator, this.denominator * r2.numerator);

        return r;
    }

    public Rational simplify() {
        BigInteger bn = new BigInteger(String.valueOf(this.numerator));
        BigInteger bd = new BigInteger(String.valueOf(this.denominator));
        BigInteger gcd = bn.gcd(bd);
        int gcdInt = gcd.intValue();

        Rational r;

        if(gcdInt > 0) {
            r = new Rational(this.numerator/gcdInt, this.denominator/gcdInt);
        }
        else
            r = new Rational(this.numerator, this.denominator);

        return r;
    }

    public String printRational() {
        String r = (Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator));
        return r;
    }



}