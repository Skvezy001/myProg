package prog;

import java.util.Objects;

public class Fraction implements Comparable<Fraction> {
    private final int numerator;
    private Integer denominator;

    Fraction(final int numerator, Integer denumirator) {
        this.numerator = numerator;
        this.denominator = denumirator;
    }

    Fraction(final int numerator) {
        this.numerator = numerator;
    }

    public final int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public Fraction mult(Fraction fraction) {
        if (this.denominator != null && (Integer)fraction.getDenominator() != null) {
            int a1 = numerator * fraction.numerator;
            int b1 = denominator * fraction.denominator;
            return new Fraction(a1, b1);
        }
        return new Fraction(numerator * fraction.numerator);
    }

    public Fraction add(Fraction fraction) {
        if (this.denominator != null && (Integer)fraction.getDenominator() != null) {
            int nok = denominator * fraction.denominator;
            int a1 = numerator * fraction.denominator;
            int a2 = fraction.numerator * denominator;
            int numerator1 = a1 + a2;
            return new Fraction(numerator1, nok);
        }
        return new Fraction(this.numerator + fraction.getNumerator());
    }

    @Override
    public String toString() {
        if (this.denominator != null) {
            return this.numerator + "/" + this.denominator;
        }
        return this.numerator + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this.denominator != null) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Fraction fraction = (Fraction) o;
            return numerator == fraction.numerator &&
                    denominator == fraction.denominator;
        }
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator;
    }

    @Override
    public int hashCode() {
        if (denominator != null) {
            return Objects.hash(numerator, denominator);
        }
        return Objects.hash(numerator);
    }

    public int compareTo(Fraction fraction) {
        if (this.toString().length() == fraction.toString().length()) {
            return 0;
        } else if (this.toString().length() > fraction.toString().length()) {
            return 1;
        } else {
            return -1;
        }
    }

}
