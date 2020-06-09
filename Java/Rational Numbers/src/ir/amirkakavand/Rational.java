package ir.amirkakavand;

import java.math.BigDecimal;

public class Rational {
    private int numerator;
    private int denominator;

    Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    Rational(int num, int denom) {
        if (denom == 0) {
            throw new Error("ERROR: Don't enter zero as denominator!");
        }
        this.numerator = num;
        this.denominator = denom;

        reduceFraction(this.numerator, this.denominator);

    }

    public static String add(Rational r1, Rational r2, int numberOfDigits) {
        if (r1.denominator == r2.denominator) {
            return r1.numerator + r2.numerator + "/" + r1.denominator + " = " + printDouble(r1.numerator + r2.numerator, r1.denominator, numberOfDigits);
        } else {
            Rational r3 = new Rational((r1.numerator * r2.denominator) + (r2.numerator * r1.denominator), r1.denominator * r2.denominator);
            return r3.numerator + "/" + r3.denominator + " = " + printDouble(r3.numerator, r3.denominator, numberOfDigits);
        }
    }

    public static String subtract(Rational r1, Rational r2, int numberOfDigits) {
        if (r1.denominator == r2.denominator) {
            return r1.numerator - r2.numerator + "/" + r1.denominator + " = " + printDouble(r1.numerator - r2.numerator, r1.denominator, numberOfDigits);
        } else {
            Rational r3 = new Rational((r1.numerator * r2.denominator) - (r2.numerator * r1.denominator), r1.denominator * r2.denominator);
            return r3.numerator + "/" + r3.denominator + " = " + printDouble(r3.numerator, r3.denominator, numberOfDigits);
        }
    }

    public static String multiply(Rational r1, Rational r2, int numberOfDigits) {
        Rational r3 = new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
        return r3.numerator + "/" + r3.denominator + " = " + printDouble(r3.numerator, r3.denominator, numberOfDigits);
    }

    public static String divide(Rational r1, Rational r2, int numberOfDigits) {
        Rational r3 = new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
        return r3.numerator + "/" + r3.denominator + " = " + printDouble(r3.numerator, r3.denominator, numberOfDigits);
    }

    private void reduceFraction(int x, int y) {
        int d, temp = 0, a = x, b = y;

        while (true) {
            if (b == 0) {
                d = a;
                break;
            }
            temp = a;
            a = b;
            b = temp % b;
        }

        this.numerator = x / d;
        this.denominator = y / d;

    }

    private static double round(double value, int numberOfDigitsAfterDecimalPoint) {
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint,
                BigDecimal.ROUND_HALF_UP);
        return bigDecimal.doubleValue();
    }

    private static double printDouble(int a, int b, int numberOfDigits) {
        double doubleNumber = (double) a / b;
        return round(doubleNumber, numberOfDigits);
    }

    public static void main(String[] args) {


    }

}
