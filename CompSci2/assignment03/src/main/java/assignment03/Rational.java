package assignment03;

/**
 * Code for Class.
 * <p>
 * CSC 1061 - Computer Science II - Java
 *
 * @author  Patrick McDougle
 * @version %I%, %G%
 * @since   1.0
 */

public class Rational extends Number implements Comparable<Rational> {
  /**
   * Auto Generated serial version id.
   */
  private static final long serialVersionUID = -1357141487023024397L;

  // Data fields for numerator and denominator
  private long numden[] = {0,1};


  /** Construct a rational with default properties */
  public Rational() {
    this(0, 1);
  }

  /** Construct a rational with specified numerator and denominator */
  public Rational(long numerator, long denominator) {
    long gcd = gcd(numerator, denominator);
    this.numden[0] = (denominator > 0 ? 1 : -1) * numerator / gcd;
    this.numden[1] = Math.abs(denominator) / gcd;
  }

  /** Find GCD of two numbers */
  private static long gcd(long n, long d) {
    long n1 = Math.abs(n);
    long n2 = Math.abs(d);
    int gcd = 1;

    for (int k = 1; k <= n1 && k <= n2; k++) {
      if (n1 % k == 0 && n2 % k == 0) {
        gcd = k;
      }
    }

    return gcd;
  }

  /** Return numerator */
  public long getNumerator() {
    return this.numden[0];
  }

  /** Return denominator */
  public long getDenominator() {
    return this.numden[1];
  }

  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {
    long n = this.numden[0] *
        secondRational.getDenominator() +
        this.numden[1] *
            secondRational.getNumerator();
    long d = this.numden[1] * secondRational.getDenominator();
    return new Rational(n, d);
  }

  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    long n = this.numden[0] *
        secondRational.getDenominator() -
        this.numden[1] *
            secondRational.getNumerator();
    long d = this.numden[1] * secondRational.getDenominator();
    return new Rational(n, d);
  }

  /** Multiply a rational number to this rational */
  public Rational multiply(Rational secondRational) {
    long n = this.numden[0] * secondRational.getNumerator();
    long d = this.numden[1] * secondRational.getDenominator();
    return new Rational(n, d);
  }

  /** Divide a rational number from this rational */
  public Rational divide(Rational secondRational) {
    long n = this.numden[0] * secondRational.getDenominator();
    long d = this.numden[1] * secondRational.getNumerator();
    return new Rational(n, d);
  }

  @Override // Override toString()
  public String toString() {
    if (this.numden[1] == 1) {
      return this.numden[0] + "";
    }

    return this.numden[0] + "/" + this.numden[1];
  }

  @Override // Override the equals method in the Object class
  public boolean equals(Object other) {
    return (this.subtract((Rational) (other))).getNumerator() == 0;
  }

  @Override // Implement the abstract intValue method in Number
  public int intValue() {
    return (int) doubleValue();
  }

  @Override // Implement the abstract floatValue method in Number
  public float floatValue() {
    return (float) doubleValue();
  }

  @Override // Implement the doubleValue method in Number
  public double doubleValue() {
    return this.numden[0] * 1.0 / this.numden[1];
  }

  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long) doubleValue();
  }

  @Override // Implement the compareTo method in Comparable
  public int compareTo(Rational o) {
    if (this.subtract(o).getNumerator() > 0) {
      return 1;
    }

    if (this.subtract(o).getNumerator() < 0) {
      return -1;
    }

    return 0;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    int prime = 31;
    hash = prime * hash + (int) this.numden[0] + (int) this.numden[1];
    return hash;
  }
}