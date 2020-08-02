package Question1;

/**
 * @date Feb 2, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Fraction {

    private int numerator;             // Fraction numerator
    private int denominator;           // Fraction denominator

    public Fraction() {

    }

    public Fraction(int num, int denom) {
        numerator = (denom < 0 ? -num : num);
        if (denom == 0) {
            denominator = 1;
        }
        denominator = (denom < 0 ? -denom : denom);
        reduce();
    }

    public void setNumerator(int num) {
        numerator = num;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denom) {
        if (denom > 0) {
            denominator = denom;
            reduce();
        } else if (denom < 0) {
            numerator = -numerator;
            denominator = -denom;
            reduce();
        }
    }

    public int getDenominator() {
        return denominator;
    }

    //fraction a + fraction b
    void add(Fraction a, Fraction b) {
        Fraction sum = new Fraction();
        sum.denominator = a.denominator * b.denominator;
        sum.numerator = a.numerator * b.denominator + b.numerator * a.denominator;
        sum.reduce();
        System.out.println(sum.toString());
    }

    //fraction a - fraction b
    void subtract(Fraction a, Fraction b) {
        Fraction sub = new Fraction();
        sub.denominator = a.denominator * b.denominator;
        sub.numerator = a.numerator * b.denominator - b.numerator * a.denominator;
        sub.reduce();
        System.out.println(sub.toString());
    }

    //fraction a * fraction b
    void multiply(Fraction a, Fraction b) {
        Fraction multi = new Fraction();
        multi.denominator = a.denominator * b.denominator;
        multi.numerator = a.numerator * b.numerator;
        multi.reduce();
        System.out.println(multi.toString());
    }

    //fraction a / fraction b
    void divide(Fraction a, Fraction b) {
        Fraction div = new Fraction();
        div.denominator = a.denominator * b.numerator;
        div.numerator = a.numerator * b.denominator;
        div.reduce();
        System.out.println(div.toString());
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    private void reduce() {
        int n = numerator, d = denominator, largest;
        if (numerator < 0) {
            n = -numerator;
        }
        if (n > d) {
            largest = n;
        } else {
            largest = d;
        }

        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
                break;
            }
        }

        if (gcd != 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
    }
}
