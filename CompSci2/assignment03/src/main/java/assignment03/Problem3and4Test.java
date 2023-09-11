package assignment03;

import java.math.BigInteger;

public class Problem3and4Test {
    public static void main(String[] args){
        Rational R1 = new Rational(new BigInteger(String.valueOf("1655555559864")), new BigInteger(String.valueOf("1655000000009864")));
        Rational R2 = new Rational(new BigInteger(String.valueOf("1655555559864")), new BigInteger(String.valueOf("1655000000009864")));
        printRational.print(R1);
        printRational.print(R2);
        printRational.print(R1.add(R2));
        printRational.print(R1.subtract(R2));
        printRational.print(R1.multiply(R2));
        printRational.print(R1.divide(R2));
    }
}

interface printRational{
    static void print(Rational R){
        System.out.println(R);
        System.out.printf("Numerator : %s\nDenominator : %s\nToString method : %s\n",R.getNumerator(),R.getDenominator(),R.toString());
        System.out.println();
    }
}
