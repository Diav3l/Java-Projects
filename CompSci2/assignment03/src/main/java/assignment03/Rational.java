package assignment03;

import java.math.BigInteger;
import java.util.Comparator;

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
  private BigInteger numden[] = new BigInteger[2];


  /** Construct a rational with default properties */
  public Rational() {
    this(new BigInteger(String.valueOf(0)), new BigInteger(String.valueOf(1)));
  }

  /** Construct a rational with specified numerator and denominator */
  public Rational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = gcd(numerator, denominator);

    this.numden[0] = new BigInteger(String.valueOf((denominator.toString().equals("0") ? new BigInteger(String.valueOf(1)) : new BigInteger(String.valueOf(-1))).multiply(numerator).divide(gcd)));
    this.numden[1] = new BigInteger(String.valueOf(denominator.abs().divide(gcd)));
  }

  /** Find GCD of two numbers */
  private static BigInteger gcd(BigInteger n, BigInteger d) {
    BigInteger n1 = n.abs();
    BigInteger n2 = d.abs();
    BigInteger gcd = new BigInteger(String.valueOf(1));

    for (BigInteger k = new BigInteger(String.valueOf(1));compareBigInteger(n1, k) && compareBigInteger(n2, k);k = k.add(new BigInteger(String.valueOf(1)))) {
      if (n1.mod(k).equals(new BigInteger(String.valueOf(0))) && n2.mod(k).equals(new BigInteger(String.valueOf(0)))) {
        gcd = new BigInteger(String.valueOf(k));
      }
    }

    return gcd;
  }

  /** Return numerator */
  public BigInteger getNumerator() {
    return this.numden[0];
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return this.numden[1];
  }

  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {
    BigInteger n = new BigInteger(String.valueOf(this.numden[0].multiply(secondRational.getDenominator()).add(this.numden[1].multiply( secondRational.getNumerator()))));
    BigInteger d = new BigInteger(String.valueOf(this.numden[1].multiply(secondRational.getDenominator())));
    return new Rational(n, d);
  }

  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    BigInteger n = this.numden[0].multiply(secondRational.getDenominator()).subtract(this.numden[1]).multiply(secondRational.getNumerator());
    BigInteger d = this.numden[1].multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Multiply a rational number to this rational */
  public Rational multiply(Rational secondRational) {
    BigInteger n = this.numden[0].multiply(secondRational.getNumerator());
    BigInteger d = this.numden[1].multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Divide a rational number from this rational */
  public Rational divide(Rational secondRational) {
    BigInteger n = this.numden[0].multiply(secondRational.getDenominator());
    BigInteger d = this.numden[1].multiply(secondRational.getNumerator());
    return new Rational(n, d);
  }

  @Override // Override toString()
  public String toString() {
    if (this.numden[1].equals(new BigInteger(String.valueOf(1)))) {
      return this.numden[0] + "";
    }

    return this.numden[0] + "/" + this.numden[1];
  }

  @Override // Override the equals method in the Object class
  public boolean equals(Object other) {
    return (this.subtract((Rational) (other))).getNumerator().equals(new BigInteger(String.valueOf(0)));
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
    return this.numden[0].intValue() * 1.0 / this.numden[1].intValue();
  }

  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long) doubleValue();
  }

  @Override // Implement the compareTo method in Comparable
  public int compareTo(Rational o) {
    return this.subtract(o).getNumerator().compareTo(new BigInteger(String.valueOf(0)));
  }

  @Override
  public int hashCode() {
    BigInteger hash = new BigInteger(String.valueOf(7));
    BigInteger prime = new BigInteger(String.valueOf(31));
    hash = prime.multiply(hash).add(this.numden[0]).add(this.numden[1]);
    return hash.intValue();
  }

  static Comparator<BigInteger> BigIntegerComparator = new Comparator<BigInteger>(){
    public int compare(BigInteger n1, BigInteger n2) {
      return n1.compareTo(n2);
    } 
  };


  static boolean compareBigInteger(BigInteger n1, BigInteger n2){
    switch(BigIntegerComparator.compare(n1, n2)){
      case 1 :
        return true;
      case -1:
        return false;
    }
    return true;
  }


}