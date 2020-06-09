package ir.amirkakavand;

public class Test {
    public static void main(String[] args) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(2, 5);

        System.out.println(Rational.add(r1, r2, 2));
        System.out.println(Rational.subtract(r1, r2, 2));
        System.out.println(Rational.multiply(r1, r2, 2));
        System.out.println(Rational.divide(r1, r2, 2));
    }
}
